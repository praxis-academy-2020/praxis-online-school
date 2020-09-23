<template>
  <div class="mt-15">
    <h1 class="text-center mb-5">TESTIMONI</h1><br>
    <v-container>
      <v-carousel class="mb-10" cycle height="200" hide-delimiter-background show-arrows-on-hover>
      <v-carousel-item v-for="(item,i) in items" :key="i" :src="item.src"></v-carousel-item>
    </v-carousel>
    </v-container>
    </div>
    
  
</template>
<script>
import gmbhome1 from "@/assets/carousel/carouselhome1.jpg";
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