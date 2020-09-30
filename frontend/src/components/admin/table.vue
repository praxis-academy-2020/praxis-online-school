<template>
  <!-- <v-data-table :headers="headers" :items="desserts" sort-by="calories" class="elevation-1">
    <template v-slot:item.actions="{ item }">
      <v-icon small @click="deleteItem(item)">mdi-delete</v-icon>
    </template>
  </v-data-table>-->

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
          <v-icon small @click="deleteItem(item)">mdi-delete</v-icon>
        </template>
      </v-data-table>
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
    deleteItem(item) {
      alert(item.nama);
    }
  }
};

// export default {
//   data: () => ({
//     headers: [
//       {
//         text: "Dessert (100g serving)",
//         align: "start",
//         sortable: false,
//         value: "name"
//       },
//       { text: "Calories", value: "calories" },
//       { text: "Fat (g)", value: "fat" },
//       { text: "Carbs (g)", value: "carbs" },
//       { text: "Protein (g)", value: "protein" },
//       { text: "Actions", value: "actions", sortable: false }
//     ],
//     desserts: [
//       {
//         name: "Frozen Yogurt",
//         calories: 159,
//         fat: 6.0,
//         carbs: 24,
//         protein: 4.0
//       },
//       {
//         name: "Ice cream sandwich",
//         calories: 237,
//         fat: 9.0,
//         carbs: 37,
//         protein: 4.3
//       },
//       {
//         name: "Eclair",
//         calories: 262,
//         fat: 16.0,
//         carbs: 23,
//         protein: 6.0
//       }
//     ]
//   }),

//   methods: {
//     deleteItem(item) {
//       alert(item.name)
//     }
//   }
// };
</script>