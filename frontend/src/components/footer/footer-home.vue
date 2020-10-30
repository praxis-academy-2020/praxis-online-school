<template>
  <v-footer color="#fff">
    <v-container>
      <hr>
      <v-row class="pt-16">
        <v-col cols="12" sm="4">
          <h3 class="mb-5">PRAXIS ACADEMY</h3>
          <p class="font-weight-light">Tentang Kami</p>
          <p class="font-weight-light">Bantuan</p>
          <p class="font-weight-light">Magang</p>
          <p class="font-weight-light">FAQ</p>
        </v-col>

        <v-col cols="12" sm="4">
          <h3 class="mb-5">PERUSAHAAN</h3>
          <p class="font-weight-light">Pendaftaran</p>
          <p class="font-weight-light">Pasang Iklan</p>
          <p class="font-weight-light">Kebijakan Privasi</p>
        </v-col>

        <v-col cols="12" sm="4">
          <h3 class="mb-5">TENTANG KAMI</h3>
          <p class="font-weight-light"
            >Praxis Academy adalah sekolah pemrograman yang khusus menangani
            aplikasi level enterprise. Kami menggunakan platform Java untuk sisi
            back end dan JavaScript untuk sisi front end .
          </p>
        </v-col>
      </v-row>

      <v-divider></v-divider>

      <v-card-text class="d-sm-flex text-center justify-center justify-sm-space-between">
        <div class="align-self-center">
          {{ new Date().getFullYear() }} — Praxis Academy
        </div>

        <div class="mt-3 mt-sm-0">
          <a
            class="text-decoration-none"
            href="https://www.facebook.com/praxisacademy.id"
            target="_blank"
            ><v-icon class="mr-2">mdi-facebook</v-icon></a
          >

          <a
            class="text-decoration-none"
            href="https://twitter.com/praxisacademyid?lang=id"
            target="_blank"
            ><v-icon class="mr-2">mdi-twitter </v-icon></a
          >

          <a
            class="text-decoration-none"
            href="https://www.instagram.com/praxisacademy/?hl=id"
            target="_blank"
            ><v-icon class="mr-2">mdi-instagram</v-icon></a
          >

          <a
            class="text-decoration-none"
            href="https://www.youtube.com/channel/UCYy3uov9SKEZt44YHgjXEEQ"
            target="_blank"
            ><v-icon class="mr-2">mdi-youtube </v-icon></a
          >
        </div>
      </v-card-text>
    </v-container>
  </v-footer>
</template>

