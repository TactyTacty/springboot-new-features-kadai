package com.example.samuraitravel.form;
 
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
 
 @Data
 @AllArgsConstructor
 public class ReviewEditForm {
     
     // idをInteger型のprivateで作成(nullを拒否で設定)
	 @NotNull
     private Integer id;
     // scoreをInteger型のprivateで作成(nullを拒否で設定し、メッセージを"評価を選択してください。"をセット)
     // また1文字以上5文字以下の制限をセットし、メッセージを"評価は1～5のいずれかを選択してください。"をセット。
	 @NotNull(message = "評価を選択してください。")
	 @Range(min = 1, max = 5, message = "評価は1～5のいずれかを選択してください。")
     private Integer score;
     // contentをString型のprivateで作成(空欄を拒否で設定し、メッセージを"コメントを入力してください。"をセット)
     // また300字以下の制限をセットし、メッセージを"コメントは300文字以内で入力してください。"をセット。
	 @NotBlank(message = "コメントを入力してください。")
	 @Length(max = 300, message = "コメントは300文字以内で入力してください。")
	 private String content;
 }