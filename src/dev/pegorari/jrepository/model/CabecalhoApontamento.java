package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoApontamento extends AbstractSankhyaEntity<CabecalhoApontamento> {
   private BigDecimal codUsu;
   private BigDecimal nuApo;
   private BigDecimal idAtv;
   private Timestamp dhApo;
   private String situacao;
   private String observacao;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
        this.nuApo = nuApo;
   }

   public BigDecimal getIdAtv() {
        return idAtv;
   }

   public void setIdAtv(BigDecimal idAtv) {
        markAsChanged("IDIATV", idAtv);
        this.idAtv = idAtv;
   }

   public Timestamp getDhApo() {
        return dhApo;
   }

   public void setDhApo(Timestamp dhApo) {
        markAsChanged("DHAPO", dhApo);
        this.dhApo = dhApo;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   @Override
   public String getTableName() {
        return "TPRAPO";
   }

   @Override
   public String getEntityName() {
        return "CabecalhoApontamento";
   }

   @Override
   public CabecalhoApontamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.idAtv = vo.asBigDecimal("IDIATV");
        this.dhApo = vo.asTimestamp("DHAPO");
        this.situacao = vo.asString("SITUACAO");
        this.observacao = vo.asString("OBSERVACAO");
        return this;
   }
}
