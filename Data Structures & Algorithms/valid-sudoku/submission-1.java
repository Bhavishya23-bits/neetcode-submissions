

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashMap<Character, Integer> h1 = new HashMap<>();

            for (int j = 0; j < 9; j++) {
                char req = board[i][j];

                if (req == '.') continue;
                if (h1.containsKey(req)) return false;

                h1.put(req, 1);
            }
        }

    
        for (int j = 0; j < 9; j++) {
            HashMap<Character, Integer> h1 = new HashMap<>();

            for (int i = 0; i < 9; i++) {
                char req = board[i][j];

                if (req == '.') continue;
                if (h1.containsKey(req)) return false;

                h1.put(req, 1);
            }
        }


        for (int box = 0; box < 9; box++) {
            HashMap<Character, Integer> map = new HashMap<>();

            int startRow = (box / 3) * 3;
            int startCol = (box % 3) * 3;

            for (int k = 0; k < 9; k++) {
                int r = startRow + k / 3;
                int c = startCol + k % 3;

                char num = board[r][c];

                if (num == '.') continue;
                if (map.containsKey(num)) return false;

                map.put(num, 1);
            }
        }

        return true;
    }
}
