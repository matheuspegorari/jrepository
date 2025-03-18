package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class FiltroFormulario extends AbstractSankhyaEntity<FiltroFormulario> {
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private String expressao;
   private String nomeInstDest;
   private String nomeInstOrig;
   private String relationName;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public String getExpressao() {
        return expressao;
   }

   public void setExpressao(String expressao) {
        markAsChanged("EXPRESSAO", expressao);
        this.expressao = expressao;
   }

   public String getNomeInstDest() {
        return nomeInstDest;
   }

   public void setNomeInstDest(String nomeInstDest) {
        markAsChanged("NOMEINSTDEST", nomeInstDest);
        this.nomeInstDest = nomeInstDest;
   }

   public String getNomeInstOrig() {
        return nomeInstOrig;
   }

   public void setNomeInstOrig(String nomeInstOrig) {
        markAsChanged("NOMEINSTORIG", nomeInstOrig);
        this.nomeInstOrig = nomeInstOrig;
   }

   public String getRelationName() {
        return relationName;
   }

   public void setRelationName(String relationName) {
        markAsChanged("RELATIONNAME", relationName);
        this.relationName = relationName;
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
        this.setOriginalVO(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.expressao = vo.asString("EXPRESSAO");
        this.nomeInstDest = vo.asString("NOMEINSTDEST");
        this.nomeInstOrig = vo.asString("NOMEINSTORIG");
        this.relationName = vo.asString("RELATIONNAME");
        return this;
   }
}
