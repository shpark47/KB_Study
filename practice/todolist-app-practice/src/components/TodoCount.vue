<template>
  <div class="row">
    <div class="col">전체 todo 개수 : {{ todolist.length }}</div>
    <div class="col">완료 todo 개수 : {{ completedTodo }}</div>
    <div class="col">미완료 todo 개수 : {{ uncompletedTodo }}</div>
  </div>
</template>
<script setup>
import { computed } from 'vue';

const props = defineProps({
  todolist: {
    type: Array,
    required: true,
  },
});

const completedTodo = computed(() => {
  return props.todolist.filter((item) => item.completed).length;
});
const uncompletedTodo = computed(() => {
  return props.todolist.filter((item) => item.completed === false).length;
});
</script>
