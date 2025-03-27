package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CodigoItemIPM extends AbstractSankhyaEntity<CodigoItemIPM> {
   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getCodUf() {
        return this.getVo().asBigDecimal("CODUF");
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
   }

   public String getCodigoItem() {
        return this.getVo().asString("CODIGOITEM");
   }

   public void setCodigoItem(String codigoItem) {
        markAsChanged("CODIGOITEM", codigoItem);
   }

   public Timestamp getDtInicial() {
        return this.getVo().asTimestamp("DTINICIAL");
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
   }

   public Timestamp getDtFinal() {
        return this.getVo().asTimestamp("DTFINAL");
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
   }

   @Override
   public String getTableName() {
        return "TGFCIPM";
   }

   @Override
   public String getEntityName() {
        return "CodigoItemIPM";
   }

   @Override
   public CodigoItemIPM fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
