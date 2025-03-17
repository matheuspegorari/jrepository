package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OcorrenciaContrato extends AbstractSankhyaEntity<OcorrenciaContrato> {
   private BigDecimal codContato;
   private BigDecimal codOcor;
   private BigDecimal codParc;
   private BigDecimal codProd;
   private BigDecimal codUsu;
   private String descricao;
   private Timestamp dtOcor;
   private BigDecimal numContrato;

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        this.codContato = codContato;
   }

   public BigDecimal getCodOcor() {
        return codOcor;
   }

   public void setCodOcor(BigDecimal codOcor) {
        this.codOcor = codOcor;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public Timestamp getDtOcor() {
        return dtOcor;
   }

   public void setDtOcor(Timestamp dtOcor) {
        this.dtOcor = dtOcor;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        this.numContrato = numContrato;
   }

   @Override
   public String getTableName() {
        return "TCSOCC";
   }

   @Override
   public String getEntityName() {
        return "OcorrenciaContrato";
   }

   @Override
   public OcorrenciaContrato fromVO(DynamicVO vo) {
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codOcor = vo.asBigDecimal("CODOCOR");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descricao = vo.asString("DESCRICAO");
        this.dtOcor = vo.asTimestamp("DTOCOR");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        return this;
   }
}
