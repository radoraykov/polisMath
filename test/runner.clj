;; Copyright (C) 2012-present, Polis Technology Inc. This program is free software: you can redistribute it and/or  modify it under the terms of the GNU Affero General Public License, version 3, as published by the Free Software Foundation. This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License for more details. You should have received a copy of the GNU Affero General Public License along with this program.  If not, see <http://www.gnu.org/licenses/>.

(ns runner
  (:require [cluster-tests]
            [conv-man-tests]
            [conversation-test]
            [index-hash-test]
            [named-matrix-test]
            [pca-test]
            [silhouette-test]
            [stats-test]
            [utils-test]
            [ptpt-stats-test]
            [clojure.test :as test]))


(defn -main []
  ;(try
    (apply
      test/run-tests
      '[cluster-tests
        conv-man-tests
        conversation-test
        index-hash-test
        named-matrix-test
        pca-test
        silhouette-test
        stats-test
        utils-test
        ptpt-stats-test]))
    ;(catch Exception e
    ;  (println "XXX Error executing tests!")
    ;  (.printStackTrace e))))

(-main)
