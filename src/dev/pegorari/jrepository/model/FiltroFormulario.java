package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class FiltroFormulario implements SankhyaEntity<FiltroFormulario> {

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
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public String getExpressao() {
        return expressao;
   }

   public void setExpressao(String expressao) {
        this.expressao = expressao;
   }

   public String getNomeInstDest() {
        return nomeInstDest;
   }

   public void setNomeInstDest(String nomeInstDest) {
        this.nomeInstDest = nomeInstDest;
   }

   public String getNomeInstOrig() {
        return nomeInstOrig;
   }

   public void setNomeInstOrig(String nomeInstOrig) {
        this.nomeInstOrig = nomeInstOrig;
   }

   public String getRelationName() {
        return relationName;
   }

   public void setRelationName(String relationName) {
        this.relationName = relationName;
   }

   @Override
   public String getEntityName() {
        return "FiltroFormulario";
   }

   @Override
   public FiltroFormulario fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.expressao = vo.asString("EXPRESSAO");
        this.nomeInstDest = vo.asString("NOMEINSTDEST");
        this.nomeInstOrig = vo.asString("NOMEINSTORIG");
        this.relationName = vo.asString("RELATIONNAME");
        return this;
   }
}
