<template>
  <div>
    <!-- card -->
    <v-col>
      <v-card class="mx-auto" max-width="400" >
        <v-img min-height="100" :src="poto"></v-img>
        <v-card-title>{{judul}}</v-card-title>
        
        
         <v-row justify="center" class="pb-5">
    <v-dialog v-model="dialog" fullscreen hide-overlay transition="dialog-bottom-transition">
      <template v-slot:activator="{ on, attrs }">
        <v-btn
          color="primary"
          dark
          v-bind="attrs"
          v-on="on"
        >
          Open Dialog
        </v-btn>
      </template>
      <v-card>
        <v-toolbar dark color="primary">
          <v-btn icon dark @click="dialog = false">
            <v-icon>mdi-close</v-icon>
          </v-btn>
          <v-toolbar-title>{{namakarya}}</v-toolbar-title>
          <v-spacer></v-spacer>
        </v-toolbar>

        <!-- modal -->
        <v-container>
        
         <v-row>
           <v-col  class="d-flex justify-center">
             <v-img  :src="poto"  max-width="300"></v-img>
           </v-col>
         </v-row>
             
          
        
        <v-row class="text-center">
          <v-col cols="12">
             <h4>Nama Team: </h4>
             <h4>{{namateam}}</h4>
          </v-col>
        </v-row>
        <v-row class="text-center">
          <v-col>
            <h2>Deskripsi Karya</h2>
            <p>{{deskripsii}}</p>
          </v-col>
        </v-row>
        <v-row>
          <v-col class="d-flex justify-center">
            <a :href="link" target="_blank" class="text-decoraton-none" ><v-btn color="primary" class="mx-auto center">GITHUB</v-btn></a>
          </v-col>
        </v-row>
        </v-container>
      </v-card>
    </v-dialog>
  </v-row>
      </v-card>
    </v-col>
  </div>
</template>
<script>

export default {
   data () {
      return {
        dialog: false,
        notifications: false,
        sound: true,
        widgets: false,
      }
    },
  props: ["judul", "deskripsi", "poto","namakarya","namateam","deskripsii","link"]
};

</script>
<style scoped>

</style>