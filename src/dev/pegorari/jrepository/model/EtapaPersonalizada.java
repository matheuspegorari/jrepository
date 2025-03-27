package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EtapaPersonalizada extends AbstractSankhyaEntity<EtapaPersonalizada> {
   public String getArqModEmail() {
        return this.getVo().asString("ARQMODEMAIL");
   }

   public void setArqModEmail(String arqModEmail) {
        markAsChanged("ARQMODEMAIL", arqModEmail);
   }

   public BigDecimal getCodEpe() {
        return this.getVo().asBigDecimal("CODEPE");
   }

   public void setCodEpe(BigDecimal codEpe) {
        markAsChanged("CODEPE", codEpe);
   }

   public BigDecimal getCodEtapa() {
        return this.getVo().asBigDecimal("CODETAPA");
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        markAsChanged("CODETAPA", codEtapa);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAbertura() {
        return this.getVo().asTimestamp("DTABERTURA");
   }

   public void setDtAbertura(Timestamp dtAbertura) {
        markAsChanged("DTABERTURA", dtAbertura);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNuRequisicao() {
        return this.getVo().asBigDecimal("NUREQUISICAO");
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
   }

   public BigDecimal getNuSelecao() {
        return this.getVo().asBigDecimal("NUSELECAO");
   }

   public void setNuSelecao(BigDecimal nuSelecao) {
        markAsChanged("NUSELECAO", nuSelecao);
   }

   @Override
   public String getTableName() {
        return "TRSEPE";
   }

   @Override
   public String getEntityName() {
        return "EtapaPersonalizada";
   }

   @Override
   public EtapaPersonalizada fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
