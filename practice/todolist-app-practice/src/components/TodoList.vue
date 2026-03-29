<template>
  <div class="row">
    <div class="col">
      <ul class="list-group">
        <TodoListItem
          v-for="todoitem in todolist"
          :key="todoitem.id"
          :todoitem="todoitem"
          @check-completed="$emit('check-completed', $event)"
          @delete-todo="$emit('delete-todo', $event)"
          @update-btn="$emit('update-btn', $event)"
          @update-todo="$emit('update-todo', $event)"
          @cancel-update="$emit('cancel-update', $event)"
        />
      </ul>
    </div>
  </div>
</template>
<script setup>
import TodoListItem from './TodoListItem.vue';
const props = defineProps(['todolist']);
</script>
