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
  beforeMount() {
    if (!localStorage.getItem("Bearer")) {
      scrollTo(0, 0);
    }else{
      this.$router.push({name: 'Dashboard'})
    }
  }
};
</script>
