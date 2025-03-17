package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoGradeProduto extends AbstractSankhyaEntity<ConfiguracaoGradeProduto> {
   private BigDecimal codUsu;
   private Timestamp dhCad;
   private BigDecimal idGrade;
   private String nomGrd;
   private String atuNuVersao;
   private BigDecimal nuVersao;
   private String usaMascara;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhCad() {
        return dhCad;
   }

   public void setDhCad(Timestamp dhCad) {
        this.dhCad = dhCad;
   }

   public BigDecimal getIdGrade() {
        return idGrade;
   }

   public void setIdGrade(BigDecimal idGrade) {
        this.idGrade = idGrade;
   }

   public String getNomGrd() {
        return nomGrd;
   }

   public void setNomGrd(String nomGrd) {
        this.nomGrd = nomGrd;
   }

   public String getAtuNuVersao() {
        return atuNuVersao;
   }

   public void setAtuNuVersao(String atuNuVersao) {
        this.atuNuVersao = atuNuVersao;
   }

   public BigDecimal getNuVersao() {
        return nuVersao;
   }

   public void setNuVersao(BigDecimal nuVersao) {
        this.nuVersao = nuVersao;
   }

   public String getUsaMascara() {
        return usaMascara;
   }

   public void setUsaMascara(String usaMascara) {
        this.usaMascara = usaMascara;
   }

   @Override
   public String getTableName() {
        return "TGFGRD";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoGradeProduto";
   }

   @Override
   public ConfiguracaoGradeProduto fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhCad = vo.asTimestamp("DHCAD");
        this.idGrade = vo.asBigDecimal("IDGRADE");
        this.nomGrd = vo.asString("NOMGRD");
        this.atuNuVersao = vo.asString("ATUNUVERSAO");
        this.nuVersao = vo.asBigDecimal("NUVERSAO");
        this.usaMascara = vo.asString("USAMASCARA");
        return this;
   }
}
