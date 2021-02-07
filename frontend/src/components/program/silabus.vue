<template>
  <div style="padding: 100px 0 0 0;">
    <v-container>
      <v-row class="text-center text-sm-left">
        <v-col cols="12" sm="4" md="2" class="d-flex justify-center align-center"><span class="text-h3 font-weight-bold primary--text">1</span></v-col>
        <v-col cols="12" sm="8" md="10"
          ><span class="text-h3 primary--text">{{title1}}</span>
          <p class="mt-3 text-h5 font-weight-light">
            {{lorem1}}
          </p></v-col
        >
      </v-row>
      <v-row class="text-center text-sm-left">
        <v-col cols="12" sm="4" md="2" class="d-flex justify-center align-center"><span class="text-h3 font-weight-bold primary--text">2</span></v-col>
        <v-col cols="12" sm="8" md="10"
          ><span class="text-h3 primary--text">{{title2}}</span>
          <p class="mt-3 text-h5 font-weight-light">
            {{lorem2}}
          </p></v-col
        >
      </v-row>
      <v-row class="text-center text-sm-left">
        <v-col cols="12" sm="4" md="2" class="d-flex justify-center align-center"><span class="text-h3 font-weight-bold primary--text">3</span></v-col>
        <v-col cols="12" sm="8" md="10">
          <span class="text-h3 primary--text">{{title3}}</span>
          <p class="mt-3 text-h5 font-weight-light">
            {{lorem3}}
          </p>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
export default {
  props:['title1','lorem1','title2','lorem2','title3','lorem3']
}
</script>