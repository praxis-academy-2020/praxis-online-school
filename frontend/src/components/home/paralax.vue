<template>
<div style="margin-top: 100px">
  <v-parallax dark src="https://cdn.vuetifyjs.com/images/backgrounds/vbanner.jpg">
    <v-row align="center" justify="center">
      <v-col class="text-center" cols="12">
        <h1 class="display-1 font-weight-thin mb-4">Daftar Bootcamp Praxis Academy</h1>
        <h4 class="subheading mb-10">Jadilah Developer Selanjutnya</h4>


        <Tombol text="Daftar sekarang" />
      </v-col>
    </v-row>
  </v-parallax>
  </div>
</template>

<script>
import Tombol from "@/components/button.vue"

export default {
  components: {
    Tombol
  }
}
</script>