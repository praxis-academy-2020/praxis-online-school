<template>
  <div>
    <v-container>
      <v-form ref="form" lazy-validation>
        <v-row>
          <v-col cols="12" sm="6">
            <v-text-field v-model="data.name" label="Name*" :rules="nameVal" required></v-text-field>
          </v-col>
          <v-col cols="12" sm="6">
            <v-select
              v-model="data.program"
              :items="kelas"
              :rules="programVal"
              label="Program*"
              required
            ></v-select>
          </v-col>
        </v-row>

        <v-row>
          <v-col cols="12" sm="6">
            <v-text-field v-model="data.email" :rules="emailVal" label="Email*" required></v-text-field>
          </v-col>
          <v-col cols="12" sm="6">
            <v-text-field
              v-model="data.tempatLahir"
              :rules="tempatlahirVal"
              label="Tempat lahir*"
              required
            ></v-text-field>
          </v-col>
        </v-row>

        <v-row>
          <v-col cols="12" sm="6">
            <v-text-field
              v-model="data.tanggalLahir"
              :rules="tanggallahirVal"
              label="Tanggal lahir*"
              required
            ></v-text-field>
          </v-col>
          <v-col cols="12" sm="6">
            <v-text-field v-model="data.nomorHP" :rules="nomorhpVal" label="Nomor HP*" required></v-text-field>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-text-field v-model="data.kotaAsal" :rules="kotaasalVal" label="Kota asal*" required></v-text-field>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-textarea
              v-model="data.alamat"
              :rules="alamatVal"
              autocomplete="alamat"
              label="Alamat*"
            ></v-textarea>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-select
              v-model="data.pendidikan"
              :rules="pendidikanVal"
              :items="pendidikanArr"
              label="Pendidikan*"
              required
            ></v-select>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-text-field
              v-model="data.namaKampus"
              :rules="namakampusVal"
              label="Nama kampus*"
              required
            ></v-text-field>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-text-field
              v-model="data.semester"
              label="Semester(diisi apabila belum lulus)"
              required
            ></v-text-field>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-textarea
              v-model="data.alamatKampus"
              :rules="alamatkampusVal"
              autocomplete="alamat kampus"
              label="Alamat kampus*"
            ></v-textarea>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-textarea
              v-model="data.pengalamanKerja"
              autocomplete="pengalaman kerja"
              label="Pengalaman kerja"
            ></v-textarea>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-textarea
              v-model="data.pengalamanProject"
              autocomplete="pengalaman project"
              label="Pengalaman project"
            ></v-textarea>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-textarea
              v-model="data.alasanIkut"
              :rules="alasanikutVal"
              autocomplete="alasan ikut"
              label="Alasan ikut*"
            ></v-textarea>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <p>Apakah anda bersedia menyelesaikan pendidikan sampai selesai?*</p>
            <v-radio-group :rules="menyelesaikanVal" v-model="menyelesaikan">
              <v-radio label="Ya" value="Ya"></v-radio>
              <v-radio label="Tidak" value="Tidak"></v-radio>
              <v-radio label="Mungkin" value="Mungkin"></v-radio>
            </v-radio-group>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <p>Apakah anda bersedia memberikan surat referensi?*</p>
            <v-radio-group :rules="referensiVal" v-model="referensi">
              <v-radio label="Ya" value="Ya"></v-radio>
              <v-radio label="Tidak" value="Tidak"></v-radio>
              <v-radio label="Mungkin" value="Mungkin"></v-radio>
            </v-radio-group>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-textarea
              v-model="data.mediaSosial"
              :rules="mediasosialVal"
              autocomplete="media sosial"
              label="Media sosial*"
            ></v-textarea>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <p>Mengetahui informasi bootcamp dari:</p>
            <v-checkbox v-model="bootcamp" label="Facebook" value="Facebook"></v-checkbox>
            <v-checkbox v-model="bootcamp" label="Facebook" value="Facebook"></v-checkbox>
            <v-checkbox v-model="bootcamp" label="Facebook" value="Facebook"></v-checkbox>
            <v-checkbox v-model="bootcamp" label="Facebook" value="Facebook"></v-checkbox>
            <v-checkbox v-model="bootcamp" label="Facebook" value="Facebook"></v-checkbox>
            <v-checkbox v-model="bootcamp" label="Facebook" value="Facebook"></v-checkbox>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-text-field
              v-model="data.info"
              label="Tuliskan nama pemberi Informasi bootcamp"
              required
            ></v-text-field>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-file-input :rules="inputVal" multiple label="Upload your CV*"></v-file-input>
          </v-col>
        </v-row>

        <small>*wajib diisi</small>
        <v-btn class="mr-4" @click="submit">submit</v-btn>
      </v-form>
    </v-container>
  </div>
</template>

<script>
export default {
  data: () => {
    return {
      // boolean
      referensiBoolean: false,

      // select
      kelas: ["frontend", "backend"],
      pendidikanArr: ["S1", "S2", "S3", "Lainnya"],

      // data
      data: {
        name: "",
        email: null,
        program: null,
        tempatLahir: null,
        tanggalLahir: null,
        nomorHP: null,
        kotaAsal: null,
        alamat: null,
        pendidikan: null,
        namaKampus: null,
        semester: null,
        alamatKampus: null,
        pengalamanKerja: null,
        pengalamanProject: null,
        alasanIkut: null,
        menyelesainkan: null,
        referensi: null,
        mediaSosial: null,
        bootcamp: []
      },

      // validate
      nameVal: [v => v.length >= 3 || "name length is 3 character"],
      programVal: [v => !!v || "required"],
      emailVal: [
        v => !!v || "E-mail is required",
        v => /.+@.+\..+/.test(v) || "E-mail must be valid"
      ],
      tempatlahirVal: [v => !!v || "required"],
      kotaasalVal: [v => !!v || "required"],
      tanggallahirVal: [v => !!v || "required"],
      nomorhpVal: [v => !!v || "required"],
      alamatVal: [v => !!v || "required"],
      pendidikanVal: [v => !!v || "required"],
      namakampusVal: [v => !!v || "required"],
      alamatkampusVal: [v => !!v || "required"],
      alasanikutVal: [v => !!v || "required"],
      menyelesaikanVal: [v => !!v || "required"],
      referensiVal: [v => !!v || "required"],
      mediasosialVal: [v => !!v || "required"],
      inputVal: [v => !!v || "required"]
    };
  },
  methods: {
    submit: function() {
      if (this.$refs.form.validate()) console.log(this.data);
      else alert("error cuy");
    }
  }
};
</script>