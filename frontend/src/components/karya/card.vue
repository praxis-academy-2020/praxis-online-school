<template>
  <v-card max-width="400px">
    <img :src="src" width="200"/>
    <v-card-title>
        {{title}}
    </v-card-title>
    <v-card-actions>
        <v-btn :to="`/creation/${route}`">
            detail
        </v-btn>
    </v-card-actions>
  </v-card>
</template>

<script>
export default {
    props: ['src', 'title', 'route']
};
</script>

<style>
</style>