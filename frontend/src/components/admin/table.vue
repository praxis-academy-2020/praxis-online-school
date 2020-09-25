<template>
  <div>
    <v-card>
      <v-card-title>
        <h3>Dashboard Admin Praxis academy</h3>
        <v-spacer></v-spacer>
        <v-text-field
          v-model="search"
          append-icon="mdi-magnify"
          label="Search"
          single-line
          hide-details
        ></v-text-field>
      </v-card-title>
      <v-data-table :headers="headers" :items="gettersApiPeserta" :search="search"></v-data-table>
    </v-card>
  </div>
</template>

<script>
import { mapGetters } from "vuex";

export default {
  data() {
    return {
      search: "",
      headers: [
        { text: "ID", value: "id" },
        {
          text: "Nama",
          value: "nama"
        },
        { text: "Nama kampus", value: "namaKampus" },
        {text: "Program", value: "program"},
        {text: "Email", value: "emailUser"}
      ]
    };
  },
  computed: {
    ...mapGetters(["gettersApiPeserta"])
  }
};
</script>

<style>
</style>