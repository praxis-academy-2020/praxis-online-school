<template>
  <div>
    <navbarHome :isInverted="false" />
    <br><br><br>
    <cardssss/>
    
    <foot/>
  </div>
</template>

<script>
import navbarHome from "@/components/navbar/navbar-home.vue";

import cardssss from "@/components/karya/card.vue"



export default {
  name: "Home",

  components: {
    navbarHome,
    
    cardssss
  },
  mounted() {
    scrollTo(0, 0);
  }
};
</script>
