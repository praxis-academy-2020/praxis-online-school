<template>
  <div>
    <v-container>
      <form @submit="checkForm" novalidate="true">
        <v-row>
          <v-col cols="12" sm="6">
            <v-text-field v-model="name" label="Name" required></v-text-field>
          </v-col>
          <v-col cols="12" sm="6">
            <v-select v-model="program" :items="kelas" label="Program" required></v-select>
          </v-col>
        </v-row>

        <v-row>
          <v-col cols="12" sm="6">
            <v-text-field v-model="email" label="Email" required></v-text-field>
          </v-col>
          <v-col cols="12" sm="6">
            <v-text-field v-model="tempatLahir" label="Tempat lahir" required></v-text-field>
          </v-col>
        </v-row>

        <v-row>
          <v-col cols="12" sm="6">
            <v-text-field v-model="tanggalLahir" label="Tanggal lahir" required></v-text-field>
          </v-col>
          <v-col cols="12" sm="6">
            <v-text-field v-model="nomorHP" label="Nomor HP" required></v-text-field>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-text-field v-model="kotaAsal" label="Kota asal" required></v-text-field>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-textarea v-model="alamat" autocomplete="alamat" label="Alamat"></v-textarea>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-select v-model="pendidikan" :items="pendidikanArr" label="Pendidikan" required></v-select>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-text-field v-model="namaKampus" label="Nama kampus" required></v-text-field>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-select v-model="semester" :items="semesterArr" label="Semester" required></v-select>
          </v-col>
        </v-row>

        <v-row>
          <v-col>
            <v-textarea v-model="alamatKampus" autocomplete="alamat kampus" label="Alamat kampus"></v-textarea>
          </v-col>
        </v-row>

        <v-btn class="mr-4" type="submit">submit</v-btn>

        <div v-if="errors.length">
          <h1>is required:</h1>
          <div v-for="(item, index) in errors" :key="index">
            <h1 class="red--text">{{item}}</h1>
          </div>
        </div>
      </form>
    </v-container>
  </div>
</template>

<script>
export default {
  data: () => {
    return {
      errors: [],
      kelas: ["frontend", "backend"],
      pendidikanArr: ["S1", "S2", "S3", "Lainnya"],
      semesterArr: ["semester 7", "semester 8"],
      name: null,
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
      alamatKampus: null
    };
  },
  methods: {
    checkForm: function(e) {
      this.errors = [];

      if (!this.name) this.errors.push("Name required.");

      if (!this.email) {
        this.errors.push("Email required.");
      } else if (!this.validEmail(this.email)) {
        this.errors.push("Valid email required.");
      }
      if (!this.errors.length) return true;
      e.preventDefault();
    },
    validEmail: function(email) {
      var re = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
      return re.test(email);
    }
  }
};
</script>