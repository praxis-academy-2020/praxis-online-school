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

      <v-data-table :headers="headers" :items="gettersApiPeserta" :search="search">
        <template v-slot:item.actions="{ item }">
          <v-icon small @click="deleteItem(item.userId)">mdi-delete</v-icon>
        </template>item
      </v-data-table>
    </v-card>
  </div>
</template>

<script>
import { mapGetters } from "vuex";
import axios from "axios";

export default {
  data() {
    return {
      search: "",
      headers: [
        { text: "ID", value: "userId" },
        {
          text: "Nama",
          value: "namaUser"
        },
        { text: "Nama kampus", value: "namaKampus" },
        { text: "Program", value: "program" },
        { text: "Email", value: "emailUser" },
        { text: "Actions", value: "actions", sortable: false }
      ]
    };
  },
  computed: {
    ...mapGetters(["gettersApiPeserta"])
  },
  methods: {
    deleteItem(id) {
      console.log(id);
      axios
        .delete(`http://192.168.1.32:8080/praxis/murid/delete/${id}`, {
          headers: {
            Authorization: "Bearer: " + localStorage.getItem("Bearer")
          }
        })
        .then(res => {
          this.$swal({
            icon: "success",
            title: "Berhasil dihapus"
          });
          console.log(res);
          this.$store.dispatch("getApiPeserta");
        })
        .catch(err => console.log(err));
    }
  }
};
</script>