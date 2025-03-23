package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DevolucaoWMS extends AbstractSankhyaEntity<DevolucaoWMS> {
   private BigDecimal sequencia;
   private BigDecimal qtdDevolver;
   private BigDecimal nuNota;
   private BigDecimal nuDev;
   private BigDecimal codUsu;
   private BigDecimal nuConferencia;
   private Timestamp dhDev;

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getQtdDevolver() {
        return qtdDevolver;
   }

   public void setQtdDevolver(BigDecimal qtdDevolver) {
        markAsChanged("QTDDEVOLVER", qtdDevolver);
        this.qtdDevolver = qtdDevolver;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getNuDev() {
        return nuDev;
   }

   public void setNuDev(BigDecimal nuDev) {
        markAsChanged("NUDEV", nuDev);
        this.nuDev = nuDev;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getNuConferencia() {
        return nuConferencia;
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        markAsChanged("NUCONFERENCIA", nuConferencia);
        this.nuConferencia = nuConferencia;
   }

   public Timestamp getDhDev() {
        return dhDev;
   }

   public void setDhDev(Timestamp dhDev) {
        markAsChanged("DHDEV", dhDev);
        this.dhDev = dhDev;
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
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.qtdDevolver = vo.asBigDecimal("QTDDEVOLVER");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuDev = vo.asBigDecimal("NUDEV");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuConferencia = vo.asBigDecimal("NUCONFERENCIA");
        this.dhDev = vo.asTimestamp("DHDEV");
        return this;
   }
}
