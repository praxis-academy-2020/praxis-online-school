<template>


  <div>
   
    <v-navigation-drawer permanent app class="warna">
      <v-list dense class="margin">
        <router-link to="/admin/dashboard" class="text-decoration-none">
          <v-img src="@/assets/p.png" aspect-ratio="1" class="ukurangmb mb-9"></v-img>
          <v-spacer></v-spacer>
          <v-list-item link class="mb-4">
            
              <v-icon class="tulisan "> mdi-apple-airplay</v-icon>
            
            <v-list-item-content>
              <v-list-item-title ><p class="tulisan2">Dashboard</p></v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </router-link>

        <router-link to="/admin/Tampil-table" class="text-decoration-none">
          <v-list-item link class="mb-4">
            
              <v-icon class="tulisan">mdi-table-account </v-icon>
            
            <v-list-item-content>
              <v-list-item-title><p class="tulisan2">Tampil Table</p></v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </router-link>
        <v-divider></v-divider>
        <router-link to="/admin/tambah-karya" class="text-decoration-none">
          <v-list-item link class="mb-4">
            
              <v-icon class="tulisan">mdi-creation</v-icon>
            
            <v-list-item-content>
              <v-list-item-title ><p class="tulisan2">Tambah Karya</p></v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </router-link>

         
      </v-list>
      <template v-slot:append>
        <div class="pa-3 d-flex justify-center">
          <v-btn class="tulisan" color="#E53935" @click="logout"><v-icon class="tulisan3 small">mdi-logout</v-icon>Logout</v-btn>
        </div>
      </template>
    </v-navigation-drawer>
  </div>
</template>

<script>
import logo from "@/assets/p.png";
export default {
  methods: {
    logout: function() {
      return this.$router.push({ name: "Home" });
    }
  },
   data: () => {
    return {
      logo
    };
  },
};
</script>

<style scoped>
.warna{
  background-color: #0f3057;
}
.tulisan{
  color: white;
  margin-bottom: 15px;
  font-size: 15px;
  
  margin-left: 10px;
}

.ukurangmb{
  height: 100px;
  width: 100px;
  display: block; margin: auto;
}
.tulisan1{
  color: white;
  text-align: center;
  
  
}
.tulisan2{
  font-size: 19px;
  color: white;
  
  margin-left: 10px;
}
.tulisan3{
  margin-top: 2px;
  margin-right: 3px;
}
</style>