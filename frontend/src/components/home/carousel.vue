<template>
  <div class="grad1">
    <v-container>
    <v-row>
      <v-col
        class="d-flex align-self-center white--text"
        cols="12"
        sm="12"
        md="6"
      >
        <div>
          <h1>Jadilah Tech Talent Masa Depan!</h1>
          <p class="mt-5 mb-15">
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolore
            provident incidunt in eum! Illum, dignissimos recusandae unde ipsa
            eaque cupiditate provident nemo sint molestiae cum? Est velit
            necessitatibus autem eligendi.
          </p>
          <tombol text="daftar sekarang" />
        </div>
      </v-col>
      <v-col cols="12" sm="12" md="6">
        <v-img class src="@/assets/carousel/hhh.png"></v-img>
        
      </v-col>
    </v-row>
    </v-container>
  </div>
</template>

<script>
import tombol from "@/components/button.vue";

export default {
  components: {
    tombol,
  },
};
</script>

<style  scoped>
.gambar {
  /* border:1px solid red; */
  margin-top: 25%;
}
.m {
  font-size: 107%;
  letter-spacing: 1px;
}
.grad1 {
  background-image: linear-gradient(to top, rgba(255, 0, 0, 0), #0b55d3 50%);
  padding: 100px 0 0 0;
}
</style>