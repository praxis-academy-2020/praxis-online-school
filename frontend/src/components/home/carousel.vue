<template>
  <div>
    <v-row>
      <v-col cols="12" sm="12" md="6">
      <h1 class="gambar ml-10">Jadilah Tech Talent Masa Depan!</h1>
<p class="ml-10 mt-5">Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolore provident incidunt in eum! Illum, dignissimos recusandae unde ipsa eaque cupiditate provident nemo sint molestiae cum? Est velit necessitatibus autem eligendi.</p>
<router-link to="/register/syarat" class="text-decoration-none ml-10">
      <v-btn color="#112d4e" class="mt-3 white--text m">DAFTAR</v-btn>
    </router-link>
    </v-col>
    <v-col cols="12" sm="12" md="6">
       <v-img class="" src="@/assets/carousel/hhh.png"></v-img>
       
    </v-col>
    </v-row>
    
  </div>
</template>

<script>
// import gmbhome1 from "@/assets/carousel/h.jpg";
// import gmbhome2 from "@/assets/carousel/CUR1.png";
// import gmbhome3 from "@/assets/carousel/CUR4.png";
// import gmbhome4 from "@/assets/carousel/CUR3.png";
// import gmbhome5 from "@/assets/carousel/CUR5.png";
// import gmbhome6 from "@/assets/carousel/CUR6.png";
export default {
  data() {
    return {
      items: [
        // {
        //   src: gmbhome1
        // }
        // {
        //   src: gmbhome2
        // },
        // {
        //   src: gmbhome3
        // },
        // {
        //   src: gmbhome4
        // },
        // {
        //   src: gmbhome5
        // },
        // {
        //   src: gmbhome6
        // }
      ]
    };
  }
};
</script>

<style  scoped>
.gambar{
  /* border:1px solid red; */
  margin-top: 25%;
}
.m{
  width: 30%;
  height: 100%;
  font-size: 107%;
}
</style>