
class Program {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrInd = 0;
        int seqInd = 0;
        while (arrInd < array.size() && seqInd < sequence.size()) {
            if (array.get(arrInd) == sequence.get(seqInd)) {
                seqInd++;
            }
            arrInd++;
        }
        return seqInd == sequence.size();
    }
}
