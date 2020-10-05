<template>
  <v-container>
    <div class="mt-5 mb-5 text-center">
      <h1>KARYA KITA</h1>
    </div>
    <v-row class="mx-auto">
      <v-col cols="12" sm="6" md="4">
        <kartu
          :poto="g1"
          judul="JOBDEV"
          namakarya="JOBDEV"
          namateam="walid, Irun"
          deskripsii="Aplikasi Lowongan Pekerjaan Untuk Developer Indonesia"
          link="https://github.com/praxis-academy-2020/lowongan-kerja"
        />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu
          :poto="g2"
          judul="Angkringan 4.0"
          namakarya="Angkringan 4.0"
          namateam="Zulfadli, Jembar"
          deskripsii="angkringan4.0 adalah aplikasi untuk order sistem yang dtargetkan untuk bisnis menengah. "
          link="https://github.com/praxis-academy-2020/angkringan"
        />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu
          :poto="g3"
          judul="Praxis Online School"
          namakarya="Praxis Online School"
          namateam="Agung, Aji, Walid, Irun"
          deskripsii=" Praxis Online School adalah sistem informasi praxis academy"
          link="https://github.com/praxis-academy-2020/praxis-online-school"
        />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu
          :poto="g4"
          judul="Perpustakaan"
          namakarya="Perpustakaan"
          namateam
          deskripsii=" "
          link="https://github.com/praxis-academy-2020/perpustakaan"
        />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu
          :poto="g5"
          judul="Bank Sampah"
          namakarya="Bank Sampah"
          namateam
          deskripsii=" "
          link="https://github.com/praxis-academy-2020/bank-sampah"
        />
      </v-col>
      <v-col cols="12" sm="6" md="4">
        <kartu
          :poto="g6"
          judul="Catatan Keuangan"
          namakarya="Catatan Keuangan"
          namateam
          deskripsii=" "
          link="https://github.com/praxis-academy-2020/catatan-keuangan"
        />
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import g1 from "@/assets/foto karya/jobdev.png";
import g2 from "@/assets/foto karya/angkringan.jpg";
import g3 from "@/assets/p.png";
import g4 from "@/assets/foto karya/perpustakaan.jpg";
import g5 from "@/assets/foto karya/bs.jpg";
import g6 from "@/assets/foto karya/catat.png";
import kartu from "@/components/home/card.vue";

export default {
  data() {
    return {
      g1,
      g2,
      g3,
      g4,
      g5,
      g6
    };
  },
  components: {
    kartu
  }
};
</script>