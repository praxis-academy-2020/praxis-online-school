<template>

    <v-container>
      <div class="mt-1 text-center">
      <h1>PROGRAM</h1>
      
    </div><br>
    <v-row>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="Enterprise Full Stack Developer" link="https://docs.google.com/file/d/0B3UxDd4duYHuamc5NUhZSGlYcGM/edit" deskripsii="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat sit praesentium laborum eligendi dolore, nemo, earum placeat aliquid accusantium impedit dolorum quos ipsum a quibusdam velit soluta dicta? Dolores, dignissimos." />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="Enterprise Python Developer" link="https://vuejs.id/" deskripsi="Belajar framework Vue JS dasar" deskripsii="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat sit praesentium laborum eligendi dolore, nemo, earum placeat aliquid accusantium impedit dolorum quos ipsum a quibusdam velit soluta dicta? Dolores, dignissimos." />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="Enterprise Front End  Developer" link=" https://drive.google.com/file/d/0BxK8qTUoVVLUS1B6ZzN5SGEtTHc/edit" deskripsii="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat sit praesentium laborum eligendi dolore, nemo, earum placeat aliquid accusantium impedit dolorum quos ipsum a quibusdam velit soluta dicta? Dolores, dignissimos." />
      </v-col>
       <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="Mobile Application Developer" link="https://docs.google.com/file/d/0B3UxDd4duYHuamc5NUhZSGlYcGM/edit" deskripsii="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat sit praesentium laborum eligendi dolore, nemo, earum placeat aliquid accusantium impedit dolorum quos ipsum a quibusdam velit soluta dicta? Dolores, dignissimos." />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="Node.js Programming" link="https://vuejs.id/" deskripsi="Belajar framework Vue JS dasar" deskripsii="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat sit praesentium laborum eligendi dolore, nemo, earum placeat aliquid accusantium impedit dolorum quos ipsum a quibusdam velit soluta dicta? Dolores, dignissimos." />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu :poto="g1" judul="UI/UX Developer" link=" https://drive.google.com/file/d/0BxK8qTUoVVLUS1B6ZzN5SGEtTHc/edit" deskripsi="Belajar Bootstrap dasar" deskripsii="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat sit praesentium laborum eligendi dolore, nemo, earum placeat aliquid accusantium impedit dolorum quos ipsum a quibusdam velit soluta dicta? Dolores, dignissimos." />
      </v-col>
    </v-row>
    
  </v-container>
</template>
<script>
import g1 from "@/assets/carousel/carouselhome3.jpg";
import kartu from "@/components/home/cardd.vue"
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

