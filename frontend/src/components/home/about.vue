<template>
  <v-container class="mt-15  bb mb-15 " fluid>
    <v-row class="d-flex flex-column-reverse flex-sm-row">
      <v-col cols="2"></v-col>
      <v-col cols="12" sm="8" class="align-self-center">

        <div class="text-center">
          <h1 >Sekilas tentang kami</h1>
          <h4 class="mt-5">Praxis Academy</h4>
          <p>
            adalah sekolah pemrograman yang khusus menangani aplikasi level
            <em>enterprise</em>.
            Kami menggunakan platform Java untuk sisi
            <em>back end</em> dan JavaScript untuk sisi
            <em>front end</em> . Sekolah
            ini didirikan tahun 2019 setelah melihat adanya kesenjangan yang signifikan antara dunia industri
            dengan dunia pendidikan. Tujuan utama dari pendirian sekolah ini adalah menjembatani dunia industri
            software dengan calon-calon SDM yang akan berkiprah di industri software tersebut. Sekolah ini
            didirikan sebagai hasil kerjasama antara pelaku di industri software serta praktisi bidang
            pendidikan yang secara khusus memang mendedikasikan diri di bidang teknologi software.
          </p>
        </div>
      </v-col>
      <v-col cols="2"></v-col>
      <!-- <v-col cols="12" sm="6">
        <v-img max-width="300" src="@/assets/p.png" class="mt-5 center" ></v-img>
      </v-col> -->
    </v-row>
  </v-container>
</template>
<script>
import back from "@/assets/program/backend.png";
import front from "@/assets/program/frontend.jpg";
// import mobile from "@/assets/program/mobile.jpg";
// import node from "@/assets/program/node.jpeg";
import python from "@/assets/program/pythondeveloper.png";
// import ui from "@/assets/program/uiux.png";

export default {
  data() {
    return {
      back,
      front,
      python,
      
    };
  },
  components: {
    
  }
};

</script>
<style scoped>
.center {
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 50%;
} 
.bb{
  background-color: #00bcd4;
  color: white ;
  border-radius: 0px 0px 60px 60px;
}
</style>