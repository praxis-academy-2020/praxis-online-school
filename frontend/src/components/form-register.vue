<template>
  <div>
    <v-container>
      <v-row>
        <v-col class="text-center">
          <h1>Registrasi Praxis Academy</h1>
        </v-col>
      </v-row>
      <v-form ref="form" lazy-validation>
        <v-row>
          <v-col cols="12" sm="6">
            <v-text-field v-model="data.nama" label="Name*" :rules="nameVal" required></v-text-field>
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
            <v-text-field v-model="data.emailUser" :rules="emailVal" label="Email*" required></v-text-field>
          </v-col>
          <v-col cols="12" sm="6">
            <v-text-field
              v-model="data.tempatTanggalLahir"
              :rules="tempatlahirVal"
              label="Tempat tanggal lahir*"
              required
            ></v-text-field>
          </v-col>
        </v-row>

        <v-row>
          <v-col cols="12" sm="6">
            <v-text-field v-model="data.status" :rules="status" label="Status*" required></v-text-field>
          </v-col>
          <v-col cols="12" sm="6">
            <v-text-field v-model="data.nomorHape" :rules="nomorhpVal" label="Nomor HP*" required></v-text-field>
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
            <v-radio-group :rules="menyelesaikanVal" v-model="data.komitmen">
              <v-radio label="Ya" value="Ya"></v-radio>
              <v-radio label="Tidak" value="Tidak"></v-radio>
              <v-radio label="Mungkin" value="Mungkin"></v-radio>
            </v-radio-group>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <p>Apakah anda bersedia memberikan surat referensi?*</p>
            <v-radio-group :rules="referensiVal" v-model="data.referensi">
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
            <v-checkbox v-model="data.bootcamp" label="Facebook" value="Facebook"></v-checkbox>
            <v-checkbox v-model="data.bootcamp" label="Instagram" value="Instagram"></v-checkbox>
            <v-checkbox v-model="data.bootcamp" label="Twitter" value="Twitter"></v-checkbox>
            <v-checkbox v-model="data.bootcamp" label="WhatsApp" value="WhatsApp"></v-checkbox>
            <v-checkbox v-model="data.bootcamp" label="LinkedIn" value="LinkedIn"></v-checkbox>
            <v-checkbox v-model="data.bootcamp" label="Teman" value="Teman"></v-checkbox>
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
            <v-file-input multiple label="Upload your CV*"></v-file-input>
          </v-col>
        </v-row>

        <small>*wajib diisi</small>

        <v-row class="mt-15">
          <v-col class="d-flex justify-center">
            <router-link to="/register/syarat" class="text-decoration-none">
              <v-btn color="#112d4e" class="white--text mr-4">back</v-btn>
            </router-link>

            <v-btn color="#112d4e" class="white--text mr-4" @click="submit">submit</v-btn>
          </v-col>
        </v-row>
      </v-form>
    </v-container>
  </div>
</template>

<script>
import { mapGetters } from "vuex";
import axios from 'axios'

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
        nama: "",
        emailUser: "",
        program: "",
        tempatTanggalLahir: "",
        status: "",
        nomorHape: "",
        kotaAsal: "",
        alamat: "",
        pendidikan: "",
        namaKampus: "",
        semester: "",
        alamatKampus: "",
        pengalamanKerja: "",
        pengalamanProject: "",
        alasanIkut: "",
        komitmen: "",
        referensi: "",
        mediaSosial: "",
        bootcamp: "",
        nomorKelas: 101
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
      status: [v => !!v || "required"],
      nomorhpVal: [v => !!v || "required"],
      alamatVal: [v => !!v || "required"],
      pendidikanVal: [v => !!v || "required"],
      namakampusVal: [v => !!v || "required"],
      alamatkampusVal: [v => !!v || "required"],
      alasanikutVal: [v => !!v || "required"],
      menyelesaikanVal: [v => !!v || "required"],
      referensiVal: [v => !!v || "required"],
      mediasosialVal: [v => !!v || "required"]
      // inputVal: [v => !!v || "required"]
    };
  },
  methods: {
    submit: function() {
      console.log(this.data);
      if (this.$refs.form.validate()) {
        axios
          .post(`http://192.168.1.4:8080/praxis/murid/post`, this.data)
          .then(res => console.log(res))
          .catch(err => console.log(err));
        console.log(this.gettersApiPeserta);
        this.$swal("josss!");
      } else {
        alert("error cuy");
      }
    }
  },
  computed: {
    ...mapGetters(["gettersApiPeserta"])
  }
};
</script>