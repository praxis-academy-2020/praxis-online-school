<template>
  <v-container>
    <v-form ref="form" lazy-validation>
      <v-row>
        <v-col>
          <v-text-field v-model="form.title" label="Title project" outlined></v-text-field>
        </v-col>
      </v-row>

      <v-row>
        <v-col>
          <v-textarea
            name="input-7-1"
            outlined
            label="Deskripsi"
            auto-grow
            v-model="form.deskripsi"
          ></v-textarea>
        </v-col>
      </v-row>

      <v-row>
        <v-col>
          <v-text-field v-model="form.github" label="Github project" outlined></v-text-field>
        </v-col>
      </v-row>

      <v-row>
        <v-col cols="6">
          <v-text-field v-model="form.anggota.nama" label="Nama anggota" outlined></v-text-field>
        </v-col>
        <v-col cols="3">
          <v-text-field v-model="form.anggota.medsos" label="Akun medsos" outlined></v-text-field>
        </v-col>
        <v-col cols="3">
          <v-text-field v-model="form.anggota.github" label="Akun github" outlined></v-text-field>
        </v-col>
      </v-row>

      <v-row>
        <v-col>
          <v-btn depressed color="primary">Mantap</v-btn>
        </v-col>
      </v-row>
    </v-form>
  </v-container>
</template>

<script>
export default {
  data: () => {
    return {
      form: {
        title: "",
        deskripsi: "",
        github: "",
        anggota: {
          nama: "",
          medsos: "",
          github: ""
        }
      }
    };
  }
};
</script>

<style>
</style>