package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class FiltroFormulario extends AbstractSankhyaEntity<FiltroFormulario> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public String getExpressao() {
        return this.getVo().asString("EXPRESSAO");
   }

   public void setExpressao(String expressao) {
        markAsChanged("EXPRESSAO", expressao);
   }

   public String getNomeInstDest() {
        return this.getVo().asString("NOMEINSTDEST");
   }

   public void setNomeInstDest(String nomeInstDest) {
        markAsChanged("NOMEINSTDEST", nomeInstDest);
   }

   public String getNomeInstOrig() {
        return this.getVo().asString("NOMEINSTORIG");
   }

   public void setNomeInstOrig(String nomeInstOrig) {
        markAsChanged("NOMEINSTORIG", nomeInstOrig);
   }

   public String getRelationName() {
        return this.getVo().asString("RELATIONNAME");
   }

   public void setRelationName(String relationName) {
        markAsChanged("RELATIONNAME", relationName);
   }

   @Override
   public String getTableName() {
        return "TSILIG";
   }

   @Override
   public String getEntityName() {
        return "FiltroFormulario";
   }

   @Override
   public FiltroFormulario fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
