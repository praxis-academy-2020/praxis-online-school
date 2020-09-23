<template>
    <v-container>
         <div class="mt-15 text-center">
      <h1>KARYA KITA</h1>
    </div><br>
    <v-row>
      <v-col cols="12" sm="6" md="4">
        <kartu 
        :poto="g1" 
        judul="JOBDEV"   
        namakarya="JOBDEV" 
        namateam="walid, khairun" 
        deskripsii="Aplikasi Lowongan Pekerjaan Untuk Developer Indonesia" 
        link="https://vuejs.id/"/>
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g2" 
        judul="Angkringan 4.0"  
        namakarya="Angkringan 4.0" 
        namateam="Zulfiandi, Jembar" 
        deskripsii="angkringan4.0 adalah aplikasi untuk order sistem yang dtargetkan untuk bisnis menengah. " 
        link="https://vuejs.id/" />
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
import g1 from "@/assets/foto karya/jobdev.png";
import g2 from "@/assets/foto karya/angkringan.jpg";
import kartu from "@/components/home/card.vue";

export default {
    data(){
    return{
      g1,
      g2
      
    }
  },
    components: {
    kartu
  }
}
</script>