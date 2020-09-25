<template>
  <v-footer color="primary" class="mt-9 ukuran">
    <div class="text-center">
      <v-row class="mt-5">
        <v-col cols="12" sm="3" md="3">
          
            <a href="https://www.facebook.com/praxisacademy.id" target="_blank"><v-icon large color="white" class="mr-2">mdi-facebook</v-icon></a>
          
           
            <a href="https://twitter.com/praxisacademyid?lang=id" target="_blank"><v-icon large color="white" class="mr-2">mdi-twitter </v-icon></a>
         
           
             <a href="https://www.instagram.com/praxisacademy/?hl=id" target="_blank"><v-icon large color="white" class="mr-2" >mdi-instagram</v-icon></a>
         
           
             <a href="https://www.youtube.com/channel/UCYy3uov9SKEZt44YHgjXEEQ" target="_blank"><v-icon large color="white" class="mr-2" >mdi-youtube </v-icon></a>
         
          <v-img src="@/assets/p.png" aspect-ratio="1" class="ukurangmb mt-5"></v-img>
        </v-col>

        <v-col cols="12" sm="4" md="3">
          <h3 class="warna mb-5">PRAXIS ACADEMY</h3>
          <p class="warna">Tentang Kami</p>
          <p class="warna">Bantuan</p>
          <p class="warna">Magang</p>
          <p class="warna">FAQ</p>
        </v-col>

        <v-col cols="12" sm="4" md="3">
          <h3 class="warna mb-5">PERUSAHAAN</h3>
          <p class="warna">Pendaftaran</p>
          <p class="warna">Pasang Iklan</p>
          <p class="warna">Kebijakan Privasi</p>
        </v-col>

        <v-col class="hidden-xs-only " md="3" >
          <h3 class="warna mb-1">TENTANG KAMI</h3>
          <v-card-text
            class="warna ukuran"
          >Praxis Academy adalah sekolah pemrograman yang khusus menangani aplikasi level enterprise. Kami menggunakan platform Java untuk sisi back end dan JavaScript untuk sisi front end . </v-card-text>
        </v-col>
      </v-row>

      <v-divider></v-divider>

      <v-card-text class="white--text ukuran">
        {{ new Date().getFullYear() }} —
        <strong>Praxis Academy</strong>
      </v-card-text>
    </div>
  </v-footer>
</template>

<script>
export default {
  data: () => ({
    
  })
};
</script>

<style scoped>
.warna {
  color: white;
}
.warna a {
  color: white;
  text-decoration: none;
}
.warna a:hover {
  color: wheat;
  text-decoration: none;
}
.ukuran{
  font-size: 12px;
  height: 100%;
}
.ukurangmb{
  height: 100px;
  width: 100px;
  display: block; margin: auto;
}
</style>