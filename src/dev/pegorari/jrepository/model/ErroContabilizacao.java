package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ErroContabilizacao extends AbstractSankhyaEntity<ErroContabilizacao> {
   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public String getContabilizado() {
        return this.getVo().asString("CONTABILIZADO");
   }

   public void setContabilizado(String contabilizado) {
        markAsChanged("CONTABILIZADO", contabilizado);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhCtz() {
        return this.getVo().asTimestamp("DHCTZ");
   }

   public void setDhCtz(Timestamp dhCtz) {
        markAsChanged("DHCTZ", dhCtz);
   }

   public BigDecimal getNuAgendCtz() {
        return this.getVo().asBigDecimal("NUAGENDCTZ");
   }

   public void setNuAgendCtz(BigDecimal nuAgendCtz) {
        markAsChanged("NUAGENDCTZ", nuAgendCtz);
   }

   public BigDecimal getNuNico() {
        return this.getVo().asBigDecimal("NUNICO");
   }

   public void setNuNico(BigDecimal nuNico) {
        markAsChanged("NUNICO", nuNico);
   }

   public BigDecimal getNuSeqErr() {
        return this.getVo().asBigDecimal("NUSEQERR");
   }

   public void setNuSeqErr(BigDecimal nuSeqErr) {
        markAsChanged("NUSEQERR", nuSeqErr);
   }

   public String getOrigem() {
        return this.getVo().asString("ORIGEM");
   }

   public void setOrigem(String origem) {
        markAsChanged("ORIGEM", origem);
   }

   public BigDecimal getSeqCtb() {
        return this.getVo().asBigDecimal("SEQCTB");
   }

   public void setSeqCtb(BigDecimal seqCtb) {
        markAsChanged("SEQCTB", seqCtb);
   }

   public String getTipLanc() {
        return this.getVo().asString("TIPLANC");
   }

   public void setTipLanc(String tipLanc) {
        markAsChanged("TIPLANC", tipLanc);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TCBERR";
   }

   @Override
   public String getEntityName() {
        return "ErroContabilizacao";
   }

   @Override
   public ErroContabilizacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
