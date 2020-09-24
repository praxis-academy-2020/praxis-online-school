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
      <tbody>
        <tr v-for="(item, index) in getApiPeserta" :key="item.id">
          <td>{{ index + 1 }}</td>
          <td>{{ item.nama }}</td>
          <td>{{item.namaKampus}}</td>
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
            'getApiPeserta'
        ])
    }
}
</script>