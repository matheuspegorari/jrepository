package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CaixaFlowrack extends AbstractSankhyaEntity<CaixaFlowrack> {
   public BigDecimal getCodVolume() {
        return this.getVo().asBigDecimal("CODVOLUME");
   }

   public void setCodVolume(BigDecimal codVolume) {
        markAsChanged("CODVOLUME", codVolume);
   }

   public String getConferido() {
        return this.getVo().asString("CONFERIDO");
   }

   public void setConferido(String conferido) {
        markAsChanged("CONFERIDO", conferido);
   }

   public BigDecimal getNuSeparacao() {
        return this.getVo().asBigDecimal("NUSEPARACAO");
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        markAsChanged("NUSEPARACAO", nuSeparacao);
   }

   public BigDecimal getNuTarefa() {
        return this.getVo().asBigDecimal("NUTAREFA");
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
   }

   public BigDecimal getQtde() {
        return this.getVo().asBigDecimal("QTDE");
   }

   public void setQtde(BigDecimal qtde) {
        markAsChanged("QTDE", qtde);
   }

   public BigDecimal getSeqTarefa() {
        return this.getVo().asBigDecimal("SEQTAREFA");
   }

   public void setSeqTarefa(BigDecimal seqTarefa) {
        markAsChanged("SEQTAREFA", seqTarefa);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTipoVolume() {
        return this.getVo().asString("TIPOVOLUME");
   }

   public void setTipoVolume(String tipoVolume) {
        markAsChanged("TIPOVOLUME", tipoVolume);
   }

   @Override
   public String getTableName() {
        return "TGWCCX";
   }

   @Override
   public String getEntityName() {
        return "CaixaFlowrack";
   }

   @Override
   public CaixaFlowrack fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
