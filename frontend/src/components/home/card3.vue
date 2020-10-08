<template>
  <v-container>
    <div class="mt-1 text-center">
      <h1>PROGRAM</h1>
    </div>
    <br />
    <v-row>
      <v-col cols="12" sm="6" md="4">
        <kartu
          :poto="back"
          judul=" Full Stack Developer"
          link="https://docs.google.com/file/d/0B3UxDd4duYHuamc5NUhZSGlYcGM/edit"
          deskripsii="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat sit praesentium laborum eligendi dolore, nemo, earum placeat aliquid accusantium impedit dolorum quos ipsum a quibusdam velit soluta dicta? Dolores, dignissimos."
        />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu
          :poto="python"
          judul="Enterprise Python Developer"
          link="https://vuejs.id/"
          deskripsi="Belajar framework Vue JS dasar"
          deskripsii="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat sit praesentium laborum eligendi dolore, nemo, earum placeat aliquid accusantium impedit dolorum quos ipsum a quibusdam velit soluta dicta? Dolores, dignissimos."
        />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu
          :poto="front"
          judul=" Front End Developer"
          link=" https://drive.google.com/file/d/0BxK8qTUoVVLUS1B6ZzN5SGEtTHc/edit"
          deskripsii="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat sit praesentium laborum eligendi dolore, nemo, earum placeat aliquid accusantium impedit dolorum quos ipsum a quibusdam velit soluta dicta? Dolores, dignissimos."
        />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu
          :poto="mobile"
          judul="Mobile Developer"
          link="https://docs.google.com/file/d/0B3UxDd4duYHuamc5NUhZSGlYcGM/edit"
          deskripsii="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat sit praesentium laborum eligendi dolore, nemo, earum placeat aliquid accusantium impedit dolorum quos ipsum a quibusdam velit soluta dicta? Dolores, dignissimos."
        />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu
          :poto="node"
          judul="Node.js Programming"
          link="https://vuejs.id/"
          deskripsi="Belajar framework Vue JS dasar"
          deskripsii="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat sit praesentium laborum eligendi dolore, nemo, earum placeat aliquid accusantium impedit dolorum quos ipsum a quibusdam velit soluta dicta? Dolores, dignissimos."
        />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu
          :poto="ui"
          judul="UI/UX Designer"
          link=" https://drive.google.com/file/d/0BxK8qTUoVVLUS1B6ZzN5SGEtTHc/edit"
          deskripsi="Belajar Bootstrap dasar"
          deskripsii="Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat sit praesentium laborum eligendi dolore, nemo, earum placeat aliquid accusantium impedit dolorum quos ipsum a quibusdam velit soluta dicta? Dolores, dignissimos."
        />
      </v-col>
    </v-row>
  </v-container>
</template>
<script>
import back from "@/assets/program/backend.png";
import front from "@/assets/program/frontend.jpg";
import mobile from "@/assets/program/mobile.jpg";
import node from "@/assets/program/node.jpeg";
import python from "@/assets/program/pythondeveloper.png";
import ui from "@/assets/program/uiux.png";
import kartu from "@/components/home/cardd.vue";
export default {
  data() {
    return {
      back,
      front,
      mobile,
      node,
      python,
      ui
    };
  },
  components: {
    kartu
  }
};
</script>

