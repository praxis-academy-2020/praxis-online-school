<template>
    <v-container>
         <div class="mt-15 text-center">
      <h1>KARYA KITA</h1>
    </div><br>
    <v-row>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="HTML Dasar"  deskripsi="Belajar HTML dasar" namakarya="apkku" namateam="walid, khairun" deskripsii="Facebook menampilkan informasi untuk membantu Anda memahami tujuan Halaman dengan lebih baik. Lihat tindakan yang diambil oleh orang yang mengelola dan memposting konten.
        " link="https://vuejs.id/"/>
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="VueJS dasar"  deskripsi="Belajar framework Vue JS dasar" />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="Bootstrap"  deskripsi="Belajar Bootstrap dasar" />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="HTML Dasar" deskripsi="Belajar HTML dasar" />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="VueJS dasar"  deskripsi="Belajar framework Vue JS dasar" />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="Bootstrap" deskripsi="Belajar Bootstrap dasar"  />
      </v-col>
    </v-row>
    
  </v-container>
</template>
<script>
import g1 from "@/assets/carousel/carouselhome3.jpg";
import kartu from "@/components/home/card.vue";

export default {
    data(){
    return{
      g1 
      
    }
  },
    components: {
    kartu
  }
}
</script>