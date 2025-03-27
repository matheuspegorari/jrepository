package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OcorrenciaContrato extends AbstractSankhyaEntity<OcorrenciaContrato> {
   public BigDecimal getCodContato() {
        return this.getVo().asBigDecimal("CODCONTATO");
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
   }

   public BigDecimal getCodOcor() {
        return this.getVo().asBigDecimal("CODOCOR");
   }

   public void setCodOcor(BigDecimal codOcor) {
        markAsChanged("CODOCOR", codOcor);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDtOcor() {
        return this.getVo().asTimestamp("DTOCOR");
   }

   public void setDtOcor(Timestamp dtOcor) {
        markAsChanged("DTOCOR", dtOcor);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
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
        this.setVo(vo);
        return this;
   }
}
