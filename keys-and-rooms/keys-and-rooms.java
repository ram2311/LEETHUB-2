class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
	Set<Integer> used = new HashSet<>();
	used.add(0);
	visit(rooms, 0, used);
	return used.size() == rooms.size();
}

private void visit(List<List<Integer>> rooms, int i, Set<Integer> used) {
	for (var key : rooms.get(i)) {
		if (!used.contains(key)) {
			used.add(key);
			visit(rooms, key, used);
		}
	}
}
}