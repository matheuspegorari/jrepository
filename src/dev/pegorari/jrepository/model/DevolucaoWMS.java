package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DevolucaoWMS extends AbstractSankhyaEntity<DevolucaoWMS> {
   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getQtdDevolver() {
        return this.getVo().asBigDecimal("QTDDEVOLVER");
   }

   public void setQtdDevolver(BigDecimal qtdDevolver) {
        markAsChanged("QTDDEVOLVER", qtdDevolver);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuDev() {
        return this.getVo().asBigDecimal("NUDEV");
   }

   public void setNuDev(BigDecimal nuDev) {
        markAsChanged("NUDEV", nuDev);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getNuConferencia() {
        return this.getVo().asBigDecimal("NUCONFERENCIA");
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        markAsChanged("NUCONFERENCIA", nuConferencia);
   }

   public Timestamp getDhDev() {
        return this.getVo().asTimestamp("DHDEV");
   }

   public void setDhDev(Timestamp dhDev) {
        markAsChanged("DHDEV", dhDev);
   }

   @Override
   public String getTableName() {
        return "TGWDEV";
   }

   @Override
   public String getEntityName() {
        return "DevolucaoWMS";
   }

   @Override
   public DevolucaoWMS fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
