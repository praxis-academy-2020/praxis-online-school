<template>
  <div>
    <v-carousel
      class="mb-10"
      cycle
      height="400"
      hide-delimiter-background
      show-arrows-on-hover
    >
      <v-carousel-item v-for="(item,i) in items" :key="i" :src="item.src"></v-carousel-item>
    </v-carousel>
  </div>
</template>

<script>
import gmbhome1 from "@/assets/carousel/CUR2.png";
import gmbhome2 from "@/assets/carousel/CUR1.png";
import gmbhome3 from "@/assets/carousel/CUR4.png";
import gmbhome4 from "@/assets/carousel/CUR3.png";
import gmbhome5 from "@/assets/carousel/CUR5.png";
import gmbhome6 from "@/assets/carousel/CUR6.png";
export default {
  data() {
    return {
      items: [
        {
          src: gmbhome1
        },
        {
          src: gmbhome2
        },
        {
          src: gmbhome3
        },
        {
          src: gmbhome4
        },
        {
          src: gmbhome5
        },
        {
          src: gmbhome6
        }
      ]
    };
  }
};
</script>