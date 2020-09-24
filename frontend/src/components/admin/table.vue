<template>
  <v-simple-table fixed-header height="300px">
    <template v-slot:default>
      <thead>
        <tr>
          <th class="text-left">No</th>
          <th class="text-left">Name</th>
          <th class="text-left">Kampus</th>
        </tr>
      </thead>

      <!-- data -->
      <tbody v-if="gettersApiPeserta.length > 0">
        <tr v-for="(item, index) in gettersApiPeserta" :key="item.id">
          <td>{{ index + 1 }}</td>
          <td>{{ item.nama }}</td>
          <td>{{item.namaKampus}}</td>
        </tr>
      </tbody>

      <!-- kosong -->
      <tbody v-else>
        <tr>
          <td>none</td>
          <td>none</td>
          <td>none</td>
        </tr>
      </tbody>
    </template>
  </v-simple-table>
</template>

<script>
import {mapGetters} from "vuex"

export default {
    computed: {
        ...mapGetters([
            'gettersApiPeserta'
        ])
    },
    mounted(){
      console.log("table", this.gettersApiPeserta)
    }
}
</script>