<template>
  <div>
    <nava />
    <div>
      <hero 
        title="Python developer"
        disk="Program belajar untuk menjadi seorang Python developer, meningkatkan skill pemrogramman Python, dan GRATIS."
      />
      <pengertian 
      :src="gmb"
      judul="Python developer"
      keterangan=" Lorem ipsum dolor sit, amet consectetur adipisicing elit. In, temporibus aliquam! Ab exercitationem ea sequi eius rem? Magni odit ut, dolor quod itaque fuga vel numquam reiciendis sunt, impedit porro?"
      />
      />
    </div>
    <foot />
  </div>
</template>

<script>
import nava from "@/components/navbar/navbar-home.vue";
import foot from "@/components/footer/footer-home.vue";
import hero from "@/components/program/hero.vue";
import pengertian from "@/components/program/pengertian.vue"
import gmb from "@/assets/program/ill1.svg"
export default {
  data(){
    return{
      gmb
    }
  },
  components: {
    nava,
    foot,
    hero,
    pengertian,
  },
};
</script>