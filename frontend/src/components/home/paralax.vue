<template>
  <v-parallax dark src="https://cdn.vuetifyjs.com/images/backgrounds/vbanner.jpg">
    <v-row align="center" justify="center">
      <v-col class="text-center" cols="12">
        <h1 class="display-1 font-weight-thin mb-4">Daftar Bootcamp Praxis Academy</h1>
        <h4 class="subheading">Jadilah Developer Selanjutnya</h4>
        <br />
        <router-link to="/register/syarat">
          <v-btn color="primary" class="m">DAFTAR</v-btn>
        </router-link>
      </v-col>
    </v-row>
  </v-parallax>
</template>
<style scoped>
.m{
  width: 30%;
  height: 100%;
  font-size: 107%;
}
</style>