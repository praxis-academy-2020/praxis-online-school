<template>
    <v-carousel class="mb-10" cycle height="400" hide-delimiter-background show-arrows-on-hover>
      <v-carousel-item v-for="(item,i) in items" :key="i" :src="item.src"></v-carousel-item>
    </v-carousel>
</template>

<script>
import gmbhome1 from "@/assets/carousel/CUR1.png";
import gmbhome2 from "@/assets/carousel/carouselhome2.jpg";
import gmbhome3 from "@/assets/carousel/carouselhome3.jpg";
export default {
    data(){
        return{
            items:[
        {
          src: gmbhome1
        },
        {
          src: gmbhome2
        },
        {
          src: gmbhome3
        }
      ]
        }
    }
}
</script>