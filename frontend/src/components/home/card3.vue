<template>
    <v-container>
    <v-row>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="HTML Dasar" link="https://docs.google.com/file/d/0B3UxDd4duYHuamc5NUhZSGlYcGM/edit" deskripsi="Belajar HTML dasar" />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="VueJS dasar" link="https://vuejs.id/" deskripsi="Belajar framework Vue JS dasar" />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="Bootstrap" link=" https://drive.google.com/file/d/0BxK8qTUoVVLUS1B6ZzN5SGEtTHc/edit" deskripsi="Belajar Bootstrap dasar" />
      </v-col>
     
    </v-row>
    
  </v-container>
</template>
<script>
import g1 from "@/assets/carousel/carouselhome3.jpg";
import kartu from "@/components/home/card.vue"
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