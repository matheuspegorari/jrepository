package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class AcessoImpressora implements SankhyaEntity<AcessoImpressora> {

   private BigDecimal codigo;
   private String nome;
   private BigDecimal nuPrinter;
   private BigDecimal nuSvp;
   private String tipo;

   public BigDecimal getCodigo() {
        return codigo;
   }

   public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
   }

   public BigDecimal getNuPrinter() {
        return nuPrinter;
   }

   public void setNuPrinter(BigDecimal nuPrinter) {
        this.nuPrinter = nuPrinter;
   }

   public BigDecimal getNuSvp() {
        return nuSvp;
   }

   public void setNuSvp(BigDecimal nuSvp) {
        this.nuSvp = nuSvp;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getEntityName() {
        return "AcessoImpressora";
   }

   @Override
   public AcessoImpressora fromVO(DynamicVO vo) {
        this.codigo = vo.asBigDecimal("CODIGO");
        this.nome = vo.asString("NOME");
        this.nuPrinter = vo.asBigDecimal("NUPRINTER");
        this.nuSvp = vo.asBigDecimal("NUSVP");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
