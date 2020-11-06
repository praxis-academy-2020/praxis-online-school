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
                  v-model="data.namaUser"
                  label="Nama lengkap*"
                  :rules="nameVal"
                  required
                  outlined
                  placeholder="Nama lengkap"
                ></v-text-field>
              </v-col>
              <v-col cols="12" sm="6">
                <v-select
                  v-model="data.program"
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
                  v-model="data.emailUser"
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
                      v-model="data.tanggalLahir"
                      label="Picker without buttons"
                      readonly
                      v-bind="attrs"
                      v-on="on"
                    ></v-text-field>
                  </template>
                  <v-date-picker
                    v-model="data.tanggalLahir"
                    @input="tanggal = false"
                    outlined
                  ></v-date-picker>
                </v-menu>
              </v-col>
            </v-row>

            <v-row>
              <v-col cols="12" sm="6">
                <v-text-field
                  v-model="data.tempatLahir"
                  :rules="status"
                  label="Tempat lahir*"
                  required
                  outlined
                  placeholder="Tempat lahir"
                ></v-text-field>
              </v-col>
              <v-col cols="12" sm="6">
                <v-text-field
                  v-model="data.nomorHape"
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
                  v-model="data.kotaAsal"
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
                  v-model="data.alamat"
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
                  v-model="data.pendidikan"
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
                  v-model="data.namaKampus"
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
                  v-model="data.semester"
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
                  v-model="data.alamatKampus"
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
                  v-model="data.pengalamanKerja"
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
                  v-model="data.pengalamanProject"
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
                  v-model="data.alasanIkut"
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
                  v-model="data.komitmen"
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
                  outlined
                  placeholder="Akun media sosial"
                ></v-textarea>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <p>Mengetahui informasi bootcamp dari:</p>
                <v-checkbox
                  v-model="data.bootCamp"
                  label="Facebook"
                  value="Facebook"
                ></v-checkbox>
                <v-checkbox
                  v-model="data.bootCamp"
                  label="Instagram"
                  value="Instagram"
                ></v-checkbox>
                <v-checkbox
                  v-model="data.bootCamp"
                  label="Twitter"
                  value="Twitter"
                ></v-checkbox>
                <v-checkbox
                  v-model="data.bootCamp"
                  label="WhatsApp"
                  value="WhatsApp"
                ></v-checkbox>
                <v-checkbox
                  v-model="data.bootCamp"
                  label="LinkedIn"
                  value="LinkedIn"
                ></v-checkbox>
                <v-checkbox
                  v-model="data.bootCamp"
                  label="Teman"
                  value="Teman"
                ></v-checkbox>
              </v-col>
            </v-row>

            <v-row>
              <v-col>
                <v-text-field
                  v-model="data.info"
                  label="Tuliskan nama pemberi Informasi bootcamp"
                  outlined
                  placeholder="Nama pemberi informasi bootcamp"
                ></v-text-field>
              </v-col>
            </v-row>

            <v-row class="d-flex flex-column">
              <v-col class="d-flex flex-column">
                <v-dialog v-model="dialog" persistent max-width="600px">
                  <template v-slot:activator="{ on, attrs }">
                    <div>
                      <p>Unggah CV anda :</p>
                      <v-btn
                        large
                        color="#03A1EA"
                        class="white--text text-capitalize"
                        v-bind="attrs"
                        @click="files()"
                        v-on="on"
                        >Tambahkan file</v-btn
                      >
                    </div>
                  </template>

                  <!-- modal -->
                  <v-card>
                    <v-card-title>
                      <span class="headline">Tambahkan file</span>
                    </v-card-title>
                    <v-card-text>
                      <v-container>
                        <v-row>
                          <v-col>
                            <v-form ref="files" lazy-validation>
                              <v-file-input
                                v-model="uploadedFiles"
                                multiple
                                @change="files()"
                                
                                accept="image/png, image/jpeg, image/bmp"
                                label="Upload CV anda*"
                                outlined
                                placeholder="Upload CV anda"
                              ></v-file-input>
                            </v-form>
                          </v-col>
                        </v-row>

                      <div v-show="isErrorUpload">
                        <v-row class="d-flex justify-center">
                          <span class="red--text">Gagal mengupload</span>
                        </v-row>
                      </div>

                      </v-container>
                    </v-card-text>
                    <v-card-actions>
                      <v-spacer></v-spacer>

                      <div v-if="isLoadingDialog">
                        <v-progress-circular
                          indeterminate
                          color="primary"
                        ></v-progress-circular>
                      </div>

                      <div v-else>
                        <v-btn color="blue darken-1" text @click="cancelFiles()"
                          >Cancel</v-btn
                        >
                        <v-btn
                          large
                          color="#03A1EA"
                          class="white--text text-capitalize"
                          v-show="this.showButton"
                          @click="upload()"
                          >Upload</v-btn
                        >
                      </div>
                    </v-card-actions>
                  </v-card>
                  <!-- end of modal -->
                </v-dialog>

                <div>
                  <v-btn class="mt-5 rounded">{{
                    this.uploadedFiles === null
                      ? "No file"
                      : this.uploadedFiles.length + " file"
                  }}</v-btn>
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
import { mapGetters } from "vuex";
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

      // data
      data: {
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
        // uploadedFileResponses: [],
      },
      uploadedFiles: [],

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
    cancelFiles() {
      this.dialog = false;
      this.uploadedFiles = [];
    },
    files() {
      if (this.uploadedFiles.length > 0) {
        this.showButton = true;
      } else {
        this.showButton = false;
      }
    },
    upload: async function () {
      if (this.$refs.files.validate()) {
        this.isLoadingDialog = true;
        this.isErrorUpload = false;

        try {
          // data file
          let formData = await new FormData();
          console.log("state ", this.uploadedFiles);

          // single file
          // formData.append("file", this.uploadedFiles);

          // multi file 1
          // for(let i = 0; i < this.uploadedFiles.length; i++){
          //   let file = this.uploadedFiles[i];
          //   formData.append("file", file);
          // }

          // multi file 2
          this.uploadedFiles.forEach((file) => {
            formData.append("files", file);
          });

          console.log("input file ", formData.getAll("files"));

          // file
          // let file = await api.postFile(formData, {
          //   headers: {
          //     "Content-Type": "multipart/form-data"
          //   }
          // });

          // multi file
          let files = await api.postFiles(formData, {
            headers: {
              "Content-Type": "multipart/form-data",
            },
          });

          let data = files.data;

          console.log("file upload ", data);
          this.isLoadingDialog = false;
        } catch (err) {
          console.log("err file ", err);
          this.isLoadingDialog = false;
          this.isErrorUpload = true;
        }
      } else {
        this.isLoadingDialog = false;
        console.log("upload error coyy");
      }
    },

    submit: async function () {
      if (this.$refs.form.validate()) {
        this.isLoading = true;

        try {
          // data
          let hasil = await api.postPeserta(this.data)

          // selesai
          console.log("selesai ", hasil);
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
  computed: {
    ...mapGetters(["gettersApiPeserta"]),
  },
};
</script>