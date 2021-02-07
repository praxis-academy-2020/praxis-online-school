<template>
  <v-container>
    <div>
      <v-row>
        <v-col cols="0" sm="0" md="3"> </v-col>
        <v-col cols="12" sm="12" md="6">
          <v-row>
            <v-col class="text-center">
              <h1>Formulir Pendaftaran</h1>
            </v-col>
          </v-row>
          <v-form ref="form" lazy-validation>
            <v-row>
              <v-col cols="12" sm="6">
                <v-text-field
                  v-model="peserta.namaUser"
                  label="Nama lengkap*"
                  :rules="nameVal"
                  required
                  outlined
                  placeholder="Nama lengkap"
                ></v-text-field>
              </v-col>
              <v-col cols="12" sm="6">
                <v-select
                  v-model="peserta.program"
                  :items="kelas"
                  :rules="programVal"
                  label="Program*"
                  required
                  outlined
                  placeholder="Program"
                ></v-select>
              </v-col>
            </v-row>

            <v-row>
              <v-col cols="12" sm="6">
                <v-text-field
                  v-model="peserta.emailUser"
                  :rules="emailVal"
                  label="Email*"
                  required
                  outlined
                  placeholder="Email"
                ></v-text-field>
              </v-col>
              <v-col cols="12" sm="6">
                <v-menu
                  v-model="tanggal"
                  :close-on-content-click="false"
                  :nudge-right="40"
                  transition="scale-transition"
                  offset-y
                  :rules="tempatlahirVal"
                  min-width="290px"
                  required
                  outlined
                >
                  <template v-slot:activator="{ on, attrs }">
                    <v-text-field
                      v-model="peserta.tanggalLahir"
                      label="Picker without buttons"
                      readonly
                      v-bind="attrs"
                      v-on="on"
                    ></v-text-field>
                  </template>
                  <v-date-picker
                    v-model="peserta.tanggalLahir"
                    @input="tanggal = false"
                    outlined
                  ></v-date-picker>
                </v-menu>
              </v-col>
            </v-row>

            <v-row>
              <v-col cols="12" sm="6">
                <v-text-field
                  v-model="peserta.tempatLahir"
                  :rules="status"
                  label="Tempat lahir*"
                  required
                  outlined
                  placeholder="Tempat lahir"
                ></v-text-field>
              </v-col>
              <v-col cols="12" sm="6">
                <v-text-field
                  v-model="peserta.nomorHape"
                  :rules="nomorhpVal"
                  label="Nomor HP*"
                  required
                  outlined
                  placeholder="Nomor handphone"
                ></v-text-field>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <v-text-field
                  v-model="peserta.kotaAsal"
                  :rules="kotaasalVal"
                  label="Kota asal*"
                  required
                  outlined
                  placeholder="Kota asal"
                ></v-text-field>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <v-textarea
                  v-model="peserta.alamat"
                  :rules="alamatVal"
                  autocomplete="alamat"
                  label="Alamat lengkap*"
                  outlined
                  placeholder="Alamat lengkap"
                ></v-textarea>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <v-select
                  v-model="peserta.pendidikan"
                  :rules="pendidikanVal"
                  :items="pendidikanArr"
                  label="Apa pendidikan terakhir anda?*"
                  required
                  outlined
                  placeholder="Pilih jenjang pendidikan"
                ></v-select>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <v-text-field
                  v-model="peserta.namaKampus"
                  :rules="namakampusVal"
                  label="Nama kampus*"
                  required
                  outlined
                  placeholder="Nama kampus"
                ></v-text-field>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <v-text-field
                  v-model="peserta.semester"
                  label="Semester"
                  required
                  outlined
                  placeholder="Pilih semester"
                ></v-text-field>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <v-textarea
                  v-model="peserta.alamatKampus"
                  :rules="alamatkampusVal"
                  autocomplete="alamat kampus"
                  label="Alamat kampus*"
                  outlined
                  placeholder="Alamat kampus"
                ></v-textarea>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <v-textarea
                  v-model="peserta.pengalamanKerja"
                  autocomplete="pengalaman kerja"
                  label="Pengalaman kerja"
                  outlined
                  placeholder="Pengalaman kerja"
                ></v-textarea>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <v-textarea
                  v-model="peserta.pengalamanProject"
                  autocomplete="pengalaman project"
                  label="Pengalaman project"
                  outlined
                  placeholder="Pengalaman project"
                ></v-textarea>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <v-textarea
                  v-model="peserta.alasanIkut"
                  :rules="alasanikutVal"
                  autocomplete="alasan ikut"
                  label="Alasan ikut*"
                  outlined
                  placeholder="Alasan ikut"
                ></v-textarea>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <p>
                  Apakah anda bersedia menyelesaikan pendidikan sampai selesai?*
                </p>
                <v-radio-group
                  :rules="menyelesaikanVal"
                  v-model="peserta.komitmen"
                >
                  <v-radio label="Ya" value="Ya"></v-radio>
                  <v-radio label="Tidak" value="Tidak"></v-radio>
                  <v-radio label="Mungkin" value="Mungkin"></v-radio>
                </v-radio-group>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <p>Apakah anda bersedia memberikan surat referensi?*</p>
                <v-radio-group
                  :rules="referensiVal"
                  v-model="peserta.referensi"
                >
                  <v-radio label="Ya" value="Ya"></v-radio>
                  <v-radio label="Tidak" value="Tidak"></v-radio>
                  <v-radio label="Mungkin" value="Mungkin"></v-radio>
                </v-radio-group>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <v-textarea
                  v-model="peserta.mediaSosial"
                  :rules="mediasosialVal"
                  autocomplete="media sosial"
                  label="Media sosial*"
                  outlined
                  placeholder="Akun media sosial"
                ></v-textarea>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <p>Mengetahui informasi bootcamp dari:</p>
                <v-checkbox
                  v-model="peserta.bootCamp"
                  label="Facebook"
                  value="Facebook"
                ></v-checkbox>
                <v-checkbox
                  v-model="peserta.bootCamp"
                  label="Instagram"
                  value="Instagram"
                ></v-checkbox>
                <v-checkbox
                  v-model="peserta.bootCamp"
                  label="Twitter"
                  value="Twitter"
                ></v-checkbox>
                <v-checkbox
                  v-model="peserta.bootCamp"
                  label="WhatsApp"
                  value="WhatsApp"
                ></v-checkbox>
                <v-checkbox
                  v-model="peserta.bootCamp"
                  label="LinkedIn"
                  value="LinkedIn"
                ></v-checkbox>
                <v-checkbox
                  v-model="peserta.bootCamp"
                  label="Teman"
                  value="Teman"
                ></v-checkbox>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <v-text-field
                  v-model="peserta.info"
                  label="Tuliskan nama pemberi Informasi bootcamp"
                  outlined
                  placeholder="Nama pemberi informasi bootcamp"
                ></v-text-field>
              </v-col>
            </v-row>

            <v-row class="d-flex flex-column">
              <v-col class="d-flex flex-column">
                <div>
                  <p>Unggah CV anda :</p>
                  <input
                    @change="fil"
                    accept="image/*"
                    type="file"
                    label="Upload CV anda*"
                    outlined
                    placeholder="Upload CV anda"
                  />
                  <v-img alt="image" :src="peserta.uploadedFiles"></v-img>
                </div>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <small>*wajib diisi</small>
              </v-col>
            </v-row>

            <div v-show="isError">
              <v-row class="d-flex justify-center">
                <span class="red--text">Tolong masukan data dengan benar</span>
              </v-row>
            </div>

            <div v-show="isErrorNetwork">
              <v-row class="d-flex justify-center">
                <span class="red--text">Network error</span>
              </v-row>
            </div>

            <v-row class="mt-15">
              <v-col class="d-flex justify-center">
                <div>
                  <div v-if="isLoading">
                    <v-progress-circular
                      indeterminate
                      color="primary"
                    ></v-progress-circular>
                  </div>

                  <div v-else>
                    <v-btn
                      to="/register/syarat"
                      large
                      color="#03A1EA"
                      class="white--text text-capitalize mr-4"
                      >back</v-btn
                    >
                    <v-btn
                      large
                      color="#03A1EA"
                      class="white--text text-capitalize"
                      @click="submit"
                      >submit</v-btn
                    >
                  </div>
                </div>
              </v-col>
            </v-row>
          </v-form>
        </v-col>
        <v-col cols="0" sm="0" md="3"> </v-col>
      </v-row>
    </div>
  </v-container>
</template>

<script>
import * as api from "../api/praxis";

export default {
  data: () => {
    return {
      // boolean
      referensiBoolean: false,
      isError: false,
      isErrorNetwork: false,
      tanggal: false,
      isLoading: false,
      dialog: false,
      isLoadingDialog: false,
      showButton: false,
      isErrorUpload: false,

      // select
      kelas: [
        "frontend developer",
        "fullstack developer",
        "python developer",
        "mobile developer",
        "nodejs developer",
      ],
      pendidikanArr: [
        "SMK",
        "D1",
        "D2",
        "D3",
        "D4",
        "S1",
        "S2",
        "S3",
        "Lainnya",
      ],

      // peserta
      peserta: {
        namaUser: "",
        emailUser: "",
        program: "",
        tanggalLahir: new Date().toISOString().substr(0, 10),
        tempatLahir: "",
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
        bootCamp: "",
        uploadedFiles: "",
      },

      // validate
      nameVal: [(v) => v.length >= 3 || "name length is 3 character"],
      programVal: [(v) => !!v || "required"],
      emailVal: [
        (v) => !!v || "E-mail is required",
        (v) => /.+@.+\..+/.test(v) || "E-mail must be valid",
      ],
      tempatlahirVal: [(v) => !!v || "required"],
      kotaasalVal: [(v) => !!v || "required"],
      status: [(v) => !!v || "required"],
      nomorhpVal: [(v) => !!v || "required"],
      alamatVal: [(v) => !!v || "required"],
      pendidikanVal: [(v) => !!v || "required"],
      namakampusVal: [(v) => !!v || "required"],
      alamatkampusVal: [(v) => !!v || "required"],
      alasanikutVal: [(v) => !!v || "required"],
      menyelesaikanVal: [(v) => !!v || "required"],
      referensiVal: [(v) => !!v || "required"],
      mediasosialVal: [(v) => !!v || "required"],
      // inputVal: [(v) => !!v || "required"],
    };
  },
  methods: {
    fil(e) {
      const file = e.target.files[0];
      this.createBase64(file, (result) => {
        this.peserta.uploadedFiles = result;
        console.log("change", this.peserta.uploadedFiles);
      });
    },
    createBase64(file, onload) {
      const reader = new FileReader();
      reader.onload = (e) => {
        onload(e.target.result);
        // console.log(e.target.result)
      };

      reader.readAsDataURL(file);
    },

    submit: async function () {
      console.log(this.peserta);
      if (this.$refs.form.validate()) {
        this.isLoading = true;

        try {
          const datas = this.peserta;
          console.log("praaa", datas);
          // peserta
          const hasil = await api.postPeserta(datas);

          // selesai
          console.log("selesai ", hasil.data);
          this.$swal({
            icon: "success",
            title: "Berhasil mendaftar",
          });
          this.$router.push({ name: "Home" });
        } catch (err) {
          this.isLoading = false;
          this.isErrorNetwork = true;
          setTimeout(() => {
            this.isErrorNetwork = false;
          }, 5000);
          console.log("try catch ", err);
        }
      } else {
        this.isError = true;
        setTimeout(() => {
          this.isError = false;
        }, 5000);
      }
    },
  },
};
</script>