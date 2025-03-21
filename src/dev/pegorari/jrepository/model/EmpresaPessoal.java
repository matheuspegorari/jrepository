package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EmpresaPessoal extends AbstractSankhyaEntity<EmpresaPessoal> {
   private String socioOstensivo;
   private String sugereDatPag;
   private String tipDiaPag;
   private BigDecimal tipEventoEsp;
   private String alterouEnd;
   private String ativo;
   private BigDecimal categFgts;
   private String centralizadora;
   private String cgcAnt;
   private String cgcSindPatronal;
   private String clubeInvest;
   private BigDecimal codCenCus;
   private BigDecimal codCtabCoint;
   private BigDecimal codCtactbRever13;
   private BigDecimal codEmp;
   private BigDecimal codEmpModHol;
   private BigDecimal codEmpOrg;
   private BigDecimal codHistCtbRever13;
   private BigDecimal codPref;
   private BigDecimal codRegFis;
   private String cpfRespCnpj;
   private BigDecimal ctaCtbReverSao;
   private BigDecimal ctaFgts;
   private String depositoJud;
   private BigDecimal diaPagFerias;
   private BigDecimal diaPagMensal;
   private BigDecimal diaPagQuinz;
   private BigDecimal diaPagQuinz2;
   private BigDecimal diaPagSem;
   private String dirfCpf;
   private String dirfDdd;
   private String dirfEmail;
   private String dirfFax;
   private String dirfFone;
   private String dirfNome;
   private String dirfRamal;
   private Timestamp dtAtual;
   private Timestamp dtEvento;
   private String emAtividade;
   private BigDecimal empDestinoCtb;
   private BigDecimal empDestinoGrelha;
   private String geraMatricula;
   private BigDecimal histCtbReverSao;
   private BigDecimal mesDissidio;
   private BigDecimal modHollerit;
   private BigDecimal numConvInt;
   private String pagaExterior;
   private BigDecimal percAlimConv;
   private BigDecimal percCestAlim;
   private BigDecimal vlrConfederativa;
   private BigDecimal vlrSindical;
   private BigDecimal percServico;
   private BigDecimal percTranspo;
   private BigDecimal porte;
   private String progAlimTrab;
   private Timestamp referencia;
   private String sindicalizada;
   private String situacaoEsp;
   private BigDecimal percCozinha;
   private BigDecimal percRefeicao;
   private BigDecimal vlrAssistencial;
   private BigDecimal vlrAssociativa;
   private String inibePonto;
   private BigDecimal modPonto;
   private String arqModEmail;
   private String impPortalRh;
   private String inibeHollerit;
   private String portalApto;
   private String portalEvolucao;
   private String portalProgFerias;
   private String importaPonto;
   private BigDecimal indDesfolha;
   private String indEnted;
   private String indEtt;
   private BigDecimal indOptRegEletron;
   private String indRpps;
   private BigDecimal indSimples;
   private BigDecimal indSitPj;
   private Timestamp iniValSocial;
   private String logoFolha;
   private String nmEnte;
   private String nroCertif;
   private String nroProtRenov;
   private String nrRegEtt;
   private BigDecimal nrSiafi;
   private BigDecimal nuProcAltOutent;
   private BigDecimal nuProcessoApr;
   private BigDecimal nuProcessoFap;
   private BigDecimal nuProcessoPcd;
   private BigDecimal nuProcessoRat;
   private BigDecimal pagDou;
   private String pastaDoPonto;
   private BigDecimal percEnte;
   private BigDecimal percSeg;
   private BigDecimal percSupl;
   private BigDecimal periodoImpPonto;
   private String reciboEsocial;
   private String regimeRetirRfcx;
   private String siglaMin;
   private BigDecimal tipLotacao;
   private String tipPonto;
   private String usadoEsocial;
   private String validaBaseImp;
   private BigDecimal valSubTeto;
   private String jesPon;
   private BigDecimal aliquotaFap;
   private BigDecimal aliquotaRat;
   private String cnpjEfr;
   private String cnpjProcurador;
   private BigDecimal codBcoFin;
   private BigDecimal codCenCusAtoCoop;
   private BigDecimal codCtabCofin;
   private BigDecimal codEmpLotacao;
   private BigDecimal codGrelha;
   private BigDecimal codInfFisc;
   private BigDecimal codNatFpas;
   private BigDecimal codNatSaldoRet;
   private BigDecimal codProjAtoCoop;
   private String contaPr;
   private String conteNted;
   private String contPcd;
   private BigDecimal controlePonto;
   private String cpfProdrural;
   private BigDecimal ctaCtbCrAtoCoop;
   private BigDecimal ctaCtbDbAtoCoop;
   private Timestamp dhUltimaImpPto;
   private BigDecimal diaApuraPonto;
   private Timestamp dtCargaInicial;
   private Timestamp dtDou;
   private Timestamp dtEmiCertif;
   private Timestamp dtIncEsocial;
   private Timestamp dtInicioEsocial;
   private Timestamp dtProtRenov;
   private Timestamp dtSesmt;
   private Timestamp dtTerceiraFase;
   private Timestamp dtUltEnvEsocial;
   private Timestamp dtVencCertif;
   private String envEsocial;
   private String enviaEmp;
   private String feriasIntegral;
   private Timestamp fimValeSocial;
   private String grupoEsocial;
   private BigDecimal histCtbCrAtoCoop;
   private BigDecimal histCtbDbAtoCoop;
   private String ideEfr;
   private BigDecimal ideSubTeto;
   private BigDecimal idMaior;
   private String permFracionarFer;
   private String permAbonoPec;
   private String integraEmpPortalRh;
   private BigDecimal codEmpFin;
   private String aprovadp;
   private String portalAltCargaHoraria;
   private String fapNaoPublicada;
   private String debSusEsocial;
   private String permFeriasAntecip;
   private Timestamp apuracaoCompetencia;
   private String permApuracaoCompet;
   private Timestamp dtVirada;
   private String inAptApInexist;
   private String isMatriz;
   private String possuiS1000;
   private String tpAmbEsocial;
   private String bloqAcessoRh;
   private String bloqAcessoSnk;
   private String bloqExibAniv;

   public String getSocioOstensivo() {
        return socioOstensivo;
   }

   public void setSocioOstensivo(String socioOstensivo) {
        markAsChanged("SOCIOOSTENSIVO", socioOstensivo);
        this.socioOstensivo = socioOstensivo;
   }

   public String getSugereDatPag() {
        return sugereDatPag;
   }

   public void setSugereDatPag(String sugereDatPag) {
        markAsChanged("SUGEREDATPAG", sugereDatPag);
        this.sugereDatPag = sugereDatPag;
   }

   public String getTipDiaPag() {
        return tipDiaPag;
   }

   public void setTipDiaPag(String tipDiaPag) {
        markAsChanged("TIPDIAPAG", tipDiaPag);
        this.tipDiaPag = tipDiaPag;
   }

   public BigDecimal getTipEventoEsp() {
        return tipEventoEsp;
   }

   public void setTipEventoEsp(BigDecimal tipEventoEsp) {
        markAsChanged("TIPEVENTOESP", tipEventoEsp);
        this.tipEventoEsp = tipEventoEsp;
   }

   public String getAlterouEnd() {
        return alterouEnd;
   }

   public void setAlterouEnd(String alterouEnd) {
        markAsChanged("ALTEROUEND", alterouEnd);
        this.alterouEnd = alterouEnd;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCategFgts() {
        return categFgts;
   }

   public void setCategFgts(BigDecimal categFgts) {
        markAsChanged("CATEGFGTS", categFgts);
        this.categFgts = categFgts;
   }

   public String getCentralizadora() {
        return centralizadora;
   }

   public void setCentralizadora(String centralizadora) {
        markAsChanged("CENTRALIZADORA", centralizadora);
        this.centralizadora = centralizadora;
   }

   public String getCgcAnt() {
        return cgcAnt;
   }

   public void setCgcAnt(String cgcAnt) {
        markAsChanged("CGCANT", cgcAnt);
        this.cgcAnt = cgcAnt;
   }

   public String getCgcSindPatronal() {
        return cgcSindPatronal;
   }

   public void setCgcSindPatronal(String cgcSindPatronal) {
        markAsChanged("CGCSINDPATRONAL", cgcSindPatronal);
        this.cgcSindPatronal = cgcSindPatronal;
   }

   public String getClubeInvest() {
        return clubeInvest;
   }

   public void setClubeInvest(String clubeInvest) {
        markAsChanged("CLUBEINVEST", clubeInvest);
        this.clubeInvest = clubeInvest;
   }

   public BigDecimal getCodCenCus() {
        return codCenCus;
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
        this.codCenCus = codCenCus;
   }

   public BigDecimal getCodCtabCoint() {
        return codCtabCoint;
   }

   public void setCodCtabCoint(BigDecimal codCtabCoint) {
        markAsChanged("CODCTABCOINT", codCtabCoint);
        this.codCtabCoint = codCtabCoint;
   }

   public BigDecimal getCodCtactbRever13() {
        return codCtactbRever13;
   }

   public void setCodCtactbRever13(BigDecimal codCtactbRever13) {
        markAsChanged("CODCTACTBREVER13", codCtactbRever13);
        this.codCtactbRever13 = codCtactbRever13;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEmpModHol() {
        return codEmpModHol;
   }

   public void setCodEmpModHol(BigDecimal codEmpModHol) {
        markAsChanged("CODEMPMODHOL", codEmpModHol);
        this.codEmpModHol = codEmpModHol;
   }

   public BigDecimal getCodEmpOrg() {
        return codEmpOrg;
   }

   public void setCodEmpOrg(BigDecimal codEmpOrg) {
        markAsChanged("CODEMPORG", codEmpOrg);
        this.codEmpOrg = codEmpOrg;
   }

   public BigDecimal getCodHistCtbRever13() {
        return codHistCtbRever13;
   }

   public void setCodHistCtbRever13(BigDecimal codHistCtbRever13) {
        markAsChanged("CODHISTCTBREVER13", codHistCtbRever13);
        this.codHistCtbRever13 = codHistCtbRever13;
   }

   public BigDecimal getCodPref() {
        return codPref;
   }

   public void setCodPref(BigDecimal codPref) {
        markAsChanged("CODPREF", codPref);
        this.codPref = codPref;
   }

   public BigDecimal getCodRegFis() {
        return codRegFis;
   }

   public void setCodRegFis(BigDecimal codRegFis) {
        markAsChanged("CODREGFIS", codRegFis);
        this.codRegFis = codRegFis;
   }

   public String getCpfRespCnpj() {
        return cpfRespCnpj;
   }

   public void setCpfRespCnpj(String cpfRespCnpj) {
        markAsChanged("CPFRESPCNPJ", cpfRespCnpj);
        this.cpfRespCnpj = cpfRespCnpj;
   }

   public BigDecimal getCtaCtbReverSao() {
        return ctaCtbReverSao;
   }

   public void setCtaCtbReverSao(BigDecimal ctaCtbReverSao) {
        markAsChanged("CTACTBREVERSAO", ctaCtbReverSao);
        this.ctaCtbReverSao = ctaCtbReverSao;
   }

   public BigDecimal getCtaFgts() {
        return ctaFgts;
   }

   public void setCtaFgts(BigDecimal ctaFgts) {
        markAsChanged("CTAFGTS", ctaFgts);
        this.ctaFgts = ctaFgts;
   }

   public String getDepositoJud() {
        return depositoJud;
   }

   public void setDepositoJud(String depositoJud) {
        markAsChanged("DEPOSITOJUD", depositoJud);
        this.depositoJud = depositoJud;
   }

   public BigDecimal getDiaPagFerias() {
        return diaPagFerias;
   }

   public void setDiaPagFerias(BigDecimal diaPagFerias) {
        markAsChanged("DIAPAGFERIAS", diaPagFerias);
        this.diaPagFerias = diaPagFerias;
   }

   public BigDecimal getDiaPagMensal() {
        return diaPagMensal;
   }

   public void setDiaPagMensal(BigDecimal diaPagMensal) {
        markAsChanged("DIAPAGMENSAL", diaPagMensal);
        this.diaPagMensal = diaPagMensal;
   }

   public BigDecimal getDiaPagQuinz() {
        return diaPagQuinz;
   }

   public void setDiaPagQuinz(BigDecimal diaPagQuinz) {
        markAsChanged("DIAPAGQUINZ", diaPagQuinz);
        this.diaPagQuinz = diaPagQuinz;
   }

   public BigDecimal getDiaPagQuinz2() {
        return diaPagQuinz2;
   }

   public void setDiaPagQuinz2(BigDecimal diaPagQuinz2) {
        markAsChanged("DIAPAGQUINZ_2", diaPagQuinz2);
        this.diaPagQuinz2 = diaPagQuinz2;
   }

   public BigDecimal getDiaPagSem() {
        return diaPagSem;
   }

   public void setDiaPagSem(BigDecimal diaPagSem) {
        markAsChanged("DIAPAGSEM", diaPagSem);
        this.diaPagSem = diaPagSem;
   }

   public String getDirfCpf() {
        return dirfCpf;
   }

   public void setDirfCpf(String dirfCpf) {
        markAsChanged("DIRFCPF", dirfCpf);
        this.dirfCpf = dirfCpf;
   }

   public String getDirfDdd() {
        return dirfDdd;
   }

   public void setDirfDdd(String dirfDdd) {
        markAsChanged("DIRFDDD", dirfDdd);
        this.dirfDdd = dirfDdd;
   }

   public String getDirfEmail() {
        return dirfEmail;
   }

   public void setDirfEmail(String dirfEmail) {
        markAsChanged("DIRFEMAIL", dirfEmail);
        this.dirfEmail = dirfEmail;
   }

   public String getDirfFax() {
        return dirfFax;
   }

   public void setDirfFax(String dirfFax) {
        markAsChanged("DIRFFAX", dirfFax);
        this.dirfFax = dirfFax;
   }

   public String getDirfFone() {
        return dirfFone;
   }

   public void setDirfFone(String dirfFone) {
        markAsChanged("DIRFFONE", dirfFone);
        this.dirfFone = dirfFone;
   }

   public String getDirfNome() {
        return dirfNome;
   }

   public void setDirfNome(String dirfNome) {
        markAsChanged("DIRFNOME", dirfNome);
        this.dirfNome = dirfNome;
   }

   public String getDirfRamal() {
        return dirfRamal;
   }

   public void setDirfRamal(String dirfRamal) {
        markAsChanged("DIRFRAMAL", dirfRamal);
        this.dirfRamal = dirfRamal;
   }

   public Timestamp getDtAtual() {
        return dtAtual;
   }

   public void setDtAtual(Timestamp dtAtual) {
        markAsChanged("DTATUAL", dtAtual);
        this.dtAtual = dtAtual;
   }

   public Timestamp getDtEvento() {
        return dtEvento;
   }

   public void setDtEvento(Timestamp dtEvento) {
        markAsChanged("DTEVENTO", dtEvento);
        this.dtEvento = dtEvento;
   }

   public String getEmAtividade() {
        return emAtividade;
   }

   public void setEmAtividade(String emAtividade) {
        markAsChanged("EMATIVIDADE", emAtividade);
        this.emAtividade = emAtividade;
   }

   public BigDecimal getEmpDestinoCtb() {
        return empDestinoCtb;
   }

   public void setEmpDestinoCtb(BigDecimal empDestinoCtb) {
        markAsChanged("EMPDESTINOCTB", empDestinoCtb);
        this.empDestinoCtb = empDestinoCtb;
   }

   public BigDecimal getEmpDestinoGrelha() {
        return empDestinoGrelha;
   }

   public void setEmpDestinoGrelha(BigDecimal empDestinoGrelha) {
        markAsChanged("EMPDESTINOGRELHA", empDestinoGrelha);
        this.empDestinoGrelha = empDestinoGrelha;
   }

   public String getGeraMatricula() {
        return geraMatricula;
   }

   public void setGeraMatricula(String geraMatricula) {
        markAsChanged("GERAMATRICULA", geraMatricula);
        this.geraMatricula = geraMatricula;
   }

   public BigDecimal getHistCtbReverSao() {
        return histCtbReverSao;
   }

   public void setHistCtbReverSao(BigDecimal histCtbReverSao) {
        markAsChanged("HISTCTBREVERSAO", histCtbReverSao);
        this.histCtbReverSao = histCtbReverSao;
   }

   public BigDecimal getMesDissidio() {
        return mesDissidio;
   }

   public void setMesDissidio(BigDecimal mesDissidio) {
        markAsChanged("MESDISSIDIO", mesDissidio);
        this.mesDissidio = mesDissidio;
   }

   public BigDecimal getModHollerit() {
        return modHollerit;
   }

   public void setModHollerit(BigDecimal modHollerit) {
        markAsChanged("MODHOLLERIT", modHollerit);
        this.modHollerit = modHollerit;
   }

   public BigDecimal getNumConvInt() {
        return numConvInt;
   }

   public void setNumConvInt(BigDecimal numConvInt) {
        markAsChanged("NUMCONVINT", numConvInt);
        this.numConvInt = numConvInt;
   }

   public String getPagaExterior() {
        return pagaExterior;
   }

   public void setPagaExterior(String pagaExterior) {
        markAsChanged("PAGAEXTERIOR", pagaExterior);
        this.pagaExterior = pagaExterior;
   }

   public BigDecimal getPercAlimConv() {
        return percAlimConv;
   }

   public void setPercAlimConv(BigDecimal percAlimConv) {
        markAsChanged("PERCALIMCONV", percAlimConv);
        this.percAlimConv = percAlimConv;
   }

   public BigDecimal getPercCestAlim() {
        return percCestAlim;
   }

   public void setPercCestAlim(BigDecimal percCestAlim) {
        markAsChanged("PERCCESTALIM", percCestAlim);
        this.percCestAlim = percCestAlim;
   }

   public BigDecimal getVlrConfederativa() {
        return vlrConfederativa;
   }

   public void setVlrConfederativa(BigDecimal vlrConfederativa) {
        markAsChanged("VLRCONFEDERATIVA", vlrConfederativa);
        this.vlrConfederativa = vlrConfederativa;
   }

   public BigDecimal getVlrSindical() {
        return vlrSindical;
   }

   public void setVlrSindical(BigDecimal vlrSindical) {
        markAsChanged("VLRSINDICAL", vlrSindical);
        this.vlrSindical = vlrSindical;
   }

   public BigDecimal getPercServico() {
        return percServico;
   }

   public void setPercServico(BigDecimal percServico) {
        markAsChanged("PERCSERVICO", percServico);
        this.percServico = percServico;
   }

   public BigDecimal getPercTranspo() {
        return percTranspo;
   }

   public void setPercTranspo(BigDecimal percTranspo) {
        markAsChanged("PERCTRANSPO", percTranspo);
        this.percTranspo = percTranspo;
   }

   public BigDecimal getPorte() {
        return porte;
   }

   public void setPorte(BigDecimal porte) {
        markAsChanged("PORTE", porte);
        this.porte = porte;
   }

   public String getProgAlimTrab() {
        return progAlimTrab;
   }

   public void setProgAlimTrab(String progAlimTrab) {
        markAsChanged("PROGALIMTRAB", progAlimTrab);
        this.progAlimTrab = progAlimTrab;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getSindicalizada() {
        return sindicalizada;
   }

   public void setSindicalizada(String sindicalizada) {
        markAsChanged("SINDICALIZADA", sindicalizada);
        this.sindicalizada = sindicalizada;
   }

   public String getSituacaoEsp() {
        return situacaoEsp;
   }

   public void setSituacaoEsp(String situacaoEsp) {
        markAsChanged("SITUACAOESP", situacaoEsp);
        this.situacaoEsp = situacaoEsp;
   }

   public BigDecimal getPercCozinha() {
        return percCozinha;
   }

   public void setPercCozinha(BigDecimal percCozinha) {
        markAsChanged("PERCCOZINHA", percCozinha);
        this.percCozinha = percCozinha;
   }

   public BigDecimal getPercRefeicao() {
        return percRefeicao;
   }

   public void setPercRefeicao(BigDecimal percRefeicao) {
        markAsChanged("PERCREFEICAO", percRefeicao);
        this.percRefeicao = percRefeicao;
   }

   public BigDecimal getVlrAssistencial() {
        return vlrAssistencial;
   }

   public void setVlrAssistencial(BigDecimal vlrAssistencial) {
        markAsChanged("VLRASSISTENCIAL", vlrAssistencial);
        this.vlrAssistencial = vlrAssistencial;
   }

   public BigDecimal getVlrAssociativa() {
        return vlrAssociativa;
   }

   public void setVlrAssociativa(BigDecimal vlrAssociativa) {
        markAsChanged("VLRASSOCIATIVA", vlrAssociativa);
        this.vlrAssociativa = vlrAssociativa;
   }

   public String getInibePonto() {
        return inibePonto;
   }

   public void setInibePonto(String inibePonto) {
        markAsChanged("INIBEPONTO", inibePonto);
        this.inibePonto = inibePonto;
   }

   public BigDecimal getModPonto() {
        return modPonto;
   }

   public void setModPonto(BigDecimal modPonto) {
        markAsChanged("MODPONTO", modPonto);
        this.modPonto = modPonto;
   }

   public String getArqModEmail() {
        return arqModEmail;
   }

   public void setArqModEmail(String arqModEmail) {
        markAsChanged("ARQMODEMAIL", arqModEmail);
        this.arqModEmail = arqModEmail;
   }

   public String getImpPortalRh() {
        return impPortalRh;
   }

   public void setImpPortalRh(String impPortalRh) {
        markAsChanged("IMPPORTALRH", impPortalRh);
        this.impPortalRh = impPortalRh;
   }

   public String getInibeHollerit() {
        return inibeHollerit;
   }

   public void setInibeHollerit(String inibeHollerit) {
        markAsChanged("INIBEHOLLERIT", inibeHollerit);
        this.inibeHollerit = inibeHollerit;
   }

   public String getPortalApto() {
        return portalApto;
   }

   public void setPortalApto(String portalApto) {
        markAsChanged("PORTALAPONTO", portalApto);
        this.portalApto = portalApto;
   }

   public String getPortalEvolucao() {
        return portalEvolucao;
   }

   public void setPortalEvolucao(String portalEvolucao) {
        markAsChanged("PORTALEVOLUCAO", portalEvolucao);
        this.portalEvolucao = portalEvolucao;
   }

   public String getPortalProgFerias() {
        return portalProgFerias;
   }

   public void setPortalProgFerias(String portalProgFerias) {
        markAsChanged("PORTALPROGFERIAS", portalProgFerias);
        this.portalProgFerias = portalProgFerias;
   }

   public String getImportaPonto() {
        return importaPonto;
   }

   public void setImportaPonto(String importaPonto) {
        markAsChanged("IMPORTAPONTO", importaPonto);
        this.importaPonto = importaPonto;
   }

   public BigDecimal getIndDesfolha() {
        return indDesfolha;
   }

   public void setIndDesfolha(BigDecimal indDesfolha) {
        markAsChanged("INDDESFOLHA", indDesfolha);
        this.indDesfolha = indDesfolha;
   }

   public String getIndEnted() {
        return indEnted;
   }

   public void setIndEnted(String indEnted) {
        markAsChanged("INDENTED", indEnted);
        this.indEnted = indEnted;
   }

   public String getIndEtt() {
        return indEtt;
   }

   public void setIndEtt(String indEtt) {
        markAsChanged("INDETT", indEtt);
        this.indEtt = indEtt;
   }

   public BigDecimal getIndOptRegEletron() {
        return indOptRegEletron;
   }

   public void setIndOptRegEletron(BigDecimal indOptRegEletron) {
        markAsChanged("INDOPTREGELETRON", indOptRegEletron);
        this.indOptRegEletron = indOptRegEletron;
   }

   public String getIndRpps() {
        return indRpps;
   }

   public void setIndRpps(String indRpps) {
        markAsChanged("INDRPPS", indRpps);
        this.indRpps = indRpps;
   }

   public BigDecimal getIndSimples() {
        return indSimples;
   }

   public void setIndSimples(BigDecimal indSimples) {
        markAsChanged("INDSIMPLES", indSimples);
        this.indSimples = indSimples;
   }

   public BigDecimal getIndSitPj() {
        return indSitPj;
   }

   public void setIndSitPj(BigDecimal indSitPj) {
        markAsChanged("INDSITPJ", indSitPj);
        this.indSitPj = indSitPj;
   }

   public Timestamp getIniValSocial() {
        return iniValSocial;
   }

   public void setIniValSocial(Timestamp iniValSocial) {
        markAsChanged("INIVALESOCIAL", iniValSocial);
        this.iniValSocial = iniValSocial;
   }

   public String getLogoFolha() {
        return logoFolha;
   }

   public void setLogoFolha(String logoFolha) {
        markAsChanged("LOGOFOLHA", logoFolha);
        this.logoFolha = logoFolha;
   }

   public String getNmEnte() {
        return nmEnte;
   }

   public void setNmEnte(String nmEnte) {
        markAsChanged("NMENTE", nmEnte);
        this.nmEnte = nmEnte;
   }

   public String getNroCertif() {
        return nroCertif;
   }

   public void setNroCertif(String nroCertif) {
        markAsChanged("NROCERTIF", nroCertif);
        this.nroCertif = nroCertif;
   }

   public String getNroProtRenov() {
        return nroProtRenov;
   }

   public void setNroProtRenov(String nroProtRenov) {
        markAsChanged("NROPROTRENOV", nroProtRenov);
        this.nroProtRenov = nroProtRenov;
   }

   public String getNrRegEtt() {
        return nrRegEtt;
   }

   public void setNrRegEtt(String nrRegEtt) {
        markAsChanged("NRREGETT", nrRegEtt);
        this.nrRegEtt = nrRegEtt;
   }

   public BigDecimal getNrSiafi() {
        return nrSiafi;
   }

   public void setNrSiafi(BigDecimal nrSiafi) {
        markAsChanged("NRSIAFI", nrSiafi);
        this.nrSiafi = nrSiafi;
   }

   public BigDecimal getNuProcAltOutent() {
        return nuProcAltOutent;
   }

   public void setNuProcAltOutent(BigDecimal nuProcAltOutent) {
        markAsChanged("NUPROCALTOUTENT", nuProcAltOutent);
        this.nuProcAltOutent = nuProcAltOutent;
   }

   public BigDecimal getNuProcessoApr() {
        return nuProcessoApr;
   }

   public void setNuProcessoApr(BigDecimal nuProcessoApr) {
        markAsChanged("NUPROCESSOAPR", nuProcessoApr);
        this.nuProcessoApr = nuProcessoApr;
   }

   public BigDecimal getNuProcessoFap() {
        return nuProcessoFap;
   }

   public void setNuProcessoFap(BigDecimal nuProcessoFap) {
        markAsChanged("NUPROCESSOFAP", nuProcessoFap);
        this.nuProcessoFap = nuProcessoFap;
   }

   public BigDecimal getNuProcessoPcd() {
        return nuProcessoPcd;
   }

   public void setNuProcessoPcd(BigDecimal nuProcessoPcd) {
        markAsChanged("NUPROCESSOPCD", nuProcessoPcd);
        this.nuProcessoPcd = nuProcessoPcd;
   }

   public BigDecimal getNuProcessoRat() {
        return nuProcessoRat;
   }

   public void setNuProcessoRat(BigDecimal nuProcessoRat) {
        markAsChanged("NUPROCESSORAT", nuProcessoRat);
        this.nuProcessoRat = nuProcessoRat;
   }

   public BigDecimal getPagDou() {
        return pagDou;
   }

   public void setPagDou(BigDecimal pagDou) {
        markAsChanged("PAGDOU", pagDou);
        this.pagDou = pagDou;
   }

   public String getPastaDoPonto() {
        return pastaDoPonto;
   }

   public void setPastaDoPonto(String pastaDoPonto) {
        markAsChanged("PASTADOPONTO", pastaDoPonto);
        this.pastaDoPonto = pastaDoPonto;
   }

   public BigDecimal getPercEnte() {
        return percEnte;
   }

   public void setPercEnte(BigDecimal percEnte) {
        markAsChanged("PERCENTE", percEnte);
        this.percEnte = percEnte;
   }

   public BigDecimal getPercSeg() {
        return percSeg;
   }

   public void setPercSeg(BigDecimal percSeg) {
        markAsChanged("PERCSEG", percSeg);
        this.percSeg = percSeg;
   }

   public BigDecimal getPercSupl() {
        return percSupl;
   }

   public void setPercSupl(BigDecimal percSupl) {
        markAsChanged("PERCSUPL", percSupl);
        this.percSupl = percSupl;
   }

   public BigDecimal getPeriodoImpPonto() {
        return periodoImpPonto;
   }

   public void setPeriodoImpPonto(BigDecimal periodoImpPonto) {
        markAsChanged("PERIODOIMPPONTO", periodoImpPonto);
        this.periodoImpPonto = periodoImpPonto;
   }

   public String getReciboEsocial() {
        return reciboEsocial;
   }

   public void setReciboEsocial(String reciboEsocial) {
        markAsChanged("RECIBOESOCIAL", reciboEsocial);
        this.reciboEsocial = reciboEsocial;
   }

   public String getRegimeRetirRfcx() {
        return regimeRetirRfcx;
   }

   public void setRegimeRetirRfcx(String regimeRetirRfcx) {
        markAsChanged("REGIMERETIRRFCX", regimeRetirRfcx);
        this.regimeRetirRfcx = regimeRetirRfcx;
   }

   public String getSiglaMin() {
        return siglaMin;
   }

   public void setSiglaMin(String siglaMin) {
        markAsChanged("SIGLAMIN", siglaMin);
        this.siglaMin = siglaMin;
   }

   public BigDecimal getTipLotacao() {
        return tipLotacao;
   }

   public void setTipLotacao(BigDecimal tipLotacao) {
        markAsChanged("TIPLOTACAO", tipLotacao);
        this.tipLotacao = tipLotacao;
   }

   public String getTipPonto() {
        return tipPonto;
   }

   public void setTipPonto(String tipPonto) {
        markAsChanged("TIPPONTO", tipPonto);
        this.tipPonto = tipPonto;
   }

   public String getUsadoEsocial() {
        return usadoEsocial;
   }

   public void setUsadoEsocial(String usadoEsocial) {
        markAsChanged("USADOESOCIAL", usadoEsocial);
        this.usadoEsocial = usadoEsocial;
   }

   public String getValidaBaseImp() {
        return validaBaseImp;
   }

   public void setValidaBaseImp(String validaBaseImp) {
        markAsChanged("VALIDABASEIMP", validaBaseImp);
        this.validaBaseImp = validaBaseImp;
   }

   public BigDecimal getValSubTeto() {
        return valSubTeto;
   }

   public void setValSubTeto(BigDecimal valSubTeto) {
        markAsChanged("VALSUBTETO", valSubTeto);
        this.valSubTeto = valSubTeto;
   }

   public String getJesPon() {
        return jesPon;
   }

   public void setJesPon(String jesPon) {
        markAsChanged("JESPON", jesPon);
        this.jesPon = jesPon;
   }

   public BigDecimal getAliquotaFap() {
        return aliquotaFap;
   }

   public void setAliquotaFap(BigDecimal aliquotaFap) {
        markAsChanged("ALIQUOTAFAP", aliquotaFap);
        this.aliquotaFap = aliquotaFap;
   }

   public BigDecimal getAliquotaRat() {
        return aliquotaRat;
   }

   public void setAliquotaRat(BigDecimal aliquotaRat) {
        markAsChanged("ALIQUOTARAT", aliquotaRat);
        this.aliquotaRat = aliquotaRat;
   }

   public String getCnpjEfr() {
        return cnpjEfr;
   }

   public void setCnpjEfr(String cnpjEfr) {
        markAsChanged("CNPJEFR", cnpjEfr);
        this.cnpjEfr = cnpjEfr;
   }

   public String getCnpjProcurador() {
        return cnpjProcurador;
   }

   public void setCnpjProcurador(String cnpjProcurador) {
        markAsChanged("CNPJPROCURADOR", cnpjProcurador);
        this.cnpjProcurador = cnpjProcurador;
   }

   public BigDecimal getCodBcoFin() {
        return codBcoFin;
   }

   public void setCodBcoFin(BigDecimal codBcoFin) {
        markAsChanged("CODBCOFIN", codBcoFin);
        this.codBcoFin = codBcoFin;
   }

   public BigDecimal getCodCenCusAtoCoop() {
        return codCenCusAtoCoop;
   }

   public void setCodCenCusAtoCoop(BigDecimal codCenCusAtoCoop) {
        markAsChanged("CODCENCUSATOCOOP", codCenCusAtoCoop);
        this.codCenCusAtoCoop = codCenCusAtoCoop;
   }

   public BigDecimal getCodCtabCofin() {
        return codCtabCofin;
   }

   public void setCodCtabCofin(BigDecimal codCtabCofin) {
        markAsChanged("CODCTABCOFIN", codCtabCofin);
        this.codCtabCofin = codCtabCofin;
   }

   public BigDecimal getCodEmpLotacao() {
        return codEmpLotacao;
   }

   public void setCodEmpLotacao(BigDecimal codEmpLotacao) {
        markAsChanged("CODEMPLOTACAO", codEmpLotacao);
        this.codEmpLotacao = codEmpLotacao;
   }

   public BigDecimal getCodGrelha() {
        return codGrelha;
   }

   public void setCodGrelha(BigDecimal codGrelha) {
        markAsChanged("CODGRELHA", codGrelha);
        this.codGrelha = codGrelha;
   }

   public BigDecimal getCodInfFisc() {
        return codInfFisc;
   }

   public void setCodInfFisc(BigDecimal codInfFisc) {
        markAsChanged("CODINFFISC", codInfFisc);
        this.codInfFisc = codInfFisc;
   }

   public BigDecimal getCodNatFpas() {
        return codNatFpas;
   }

   public void setCodNatFpas(BigDecimal codNatFpas) {
        markAsChanged("CODNATFPAS", codNatFpas);
        this.codNatFpas = codNatFpas;
   }

   public BigDecimal getCodNatSaldoRet() {
        return codNatSaldoRet;
   }

   public void setCodNatSaldoRet(BigDecimal codNatSaldoRet) {
        markAsChanged("CODNATSALDORET", codNatSaldoRet);
        this.codNatSaldoRet = codNatSaldoRet;
   }

   public BigDecimal getCodProjAtoCoop() {
        return codProjAtoCoop;
   }

   public void setCodProjAtoCoop(BigDecimal codProjAtoCoop) {
        markAsChanged("CODPROJATOCOOP", codProjAtoCoop);
        this.codProjAtoCoop = codProjAtoCoop;
   }

   public String getContaPr() {
        return contaPr;
   }

   public void setContaPr(String contaPr) {
        markAsChanged("CONTAPR", contaPr);
        this.contaPr = contaPr;
   }

   public String getConteNted() {
        return conteNted;
   }

   public void setConteNted(String conteNted) {
        markAsChanged("CONTENTED", conteNted);
        this.conteNted = conteNted;
   }

   public String getContPcd() {
        return contPcd;
   }

   public void setContPcd(String contPcd) {
        markAsChanged("CONTPCD", contPcd);
        this.contPcd = contPcd;
   }

   public BigDecimal getControlePonto() {
        return controlePonto;
   }

   public void setControlePonto(BigDecimal controlePonto) {
        markAsChanged("CONTROLEPONTO", controlePonto);
        this.controlePonto = controlePonto;
   }

   public String getCpfProdrural() {
        return cpfProdrural;
   }

   public void setCpfProdrural(String cpfProdrural) {
        markAsChanged("CPFPRODRURAL", cpfProdrural);
        this.cpfProdrural = cpfProdrural;
   }

   public BigDecimal getCtaCtbCrAtoCoop() {
        return ctaCtbCrAtoCoop;
   }

   public void setCtaCtbCrAtoCoop(BigDecimal ctaCtbCrAtoCoop) {
        markAsChanged("CTACTBCRATOCOOP", ctaCtbCrAtoCoop);
        this.ctaCtbCrAtoCoop = ctaCtbCrAtoCoop;
   }

   public BigDecimal getCtaCtbDbAtoCoop() {
        return ctaCtbDbAtoCoop;
   }

   public void setCtaCtbDbAtoCoop(BigDecimal ctaCtbDbAtoCoop) {
        markAsChanged("CTACTBDBATOCOOP", ctaCtbDbAtoCoop);
        this.ctaCtbDbAtoCoop = ctaCtbDbAtoCoop;
   }

   public Timestamp getDhUltimaImpPto() {
        return dhUltimaImpPto;
   }

   public void setDhUltimaImpPto(Timestamp dhUltimaImpPto) {
        markAsChanged("DHULTIMAIMPPTO", dhUltimaImpPto);
        this.dhUltimaImpPto = dhUltimaImpPto;
   }

   public BigDecimal getDiaApuraPonto() {
        return diaApuraPonto;
   }

   public void setDiaApuraPonto(BigDecimal diaApuraPonto) {
        markAsChanged("DIAAPURAPONTO", diaApuraPonto);
        this.diaApuraPonto = diaApuraPonto;
   }

   public Timestamp getDtCargaInicial() {
        return dtCargaInicial;
   }

   public void setDtCargaInicial(Timestamp dtCargaInicial) {
        markAsChanged("DTCARGAINICIAL", dtCargaInicial);
        this.dtCargaInicial = dtCargaInicial;
   }

   public Timestamp getDtDou() {
        return dtDou;
   }

   public void setDtDou(Timestamp dtDou) {
        markAsChanged("DTDOU", dtDou);
        this.dtDou = dtDou;
   }

   public Timestamp getDtEmiCertif() {
        return dtEmiCertif;
   }

   public void setDtEmiCertif(Timestamp dtEmiCertif) {
        markAsChanged("DTEMICERTIF", dtEmiCertif);
        this.dtEmiCertif = dtEmiCertif;
   }

   public Timestamp getDtIncEsocial() {
        return dtIncEsocial;
   }

   public void setDtIncEsocial(Timestamp dtIncEsocial) {
        markAsChanged("DTINC_ESOCIAL", dtIncEsocial);
        this.dtIncEsocial = dtIncEsocial;
   }

   public Timestamp getDtInicioEsocial() {
        return dtInicioEsocial;
   }

   public void setDtInicioEsocial(Timestamp dtInicioEsocial) {
        markAsChanged("DTINICIOESOCIAL", dtInicioEsocial);
        this.dtInicioEsocial = dtInicioEsocial;
   }

   public Timestamp getDtProtRenov() {
        return dtProtRenov;
   }

   public void setDtProtRenov(Timestamp dtProtRenov) {
        markAsChanged("DTPROTRENOV", dtProtRenov);
        this.dtProtRenov = dtProtRenov;
   }

   public Timestamp getDtSesmt() {
        return dtSesmt;
   }

   public void setDtSesmt(Timestamp dtSesmt) {
        markAsChanged("DTSESMT", dtSesmt);
        this.dtSesmt = dtSesmt;
   }

   public Timestamp getDtTerceiraFase() {
        return dtTerceiraFase;
   }

   public void setDtTerceiraFase(Timestamp dtTerceiraFase) {
        markAsChanged("DTTERCEIRAFASE", dtTerceiraFase);
        this.dtTerceiraFase = dtTerceiraFase;
   }

   public Timestamp getDtUltEnvEsocial() {
        return dtUltEnvEsocial;
   }

   public void setDtUltEnvEsocial(Timestamp dtUltEnvEsocial) {
        markAsChanged("DTULTENV_ESOCIAL", dtUltEnvEsocial);
        this.dtUltEnvEsocial = dtUltEnvEsocial;
   }

   public Timestamp getDtVencCertif() {
        return dtVencCertif;
   }

   public void setDtVencCertif(Timestamp dtVencCertif) {
        markAsChanged("DTVENCCERTIF", dtVencCertif);
        this.dtVencCertif = dtVencCertif;
   }

   public String getEnvEsocial() {
        return envEsocial;
   }

   public void setEnvEsocial(String envEsocial) {
        markAsChanged("ENVESOCIAL", envEsocial);
        this.envEsocial = envEsocial;
   }

   public String getEnviaEmp() {
        return enviaEmp;
   }

   public void setEnviaEmp(String enviaEmp) {
        markAsChanged("ENVIAEMP", enviaEmp);
        this.enviaEmp = enviaEmp;
   }

   public String getFeriasIntegral() {
        return feriasIntegral;
   }

   public void setFeriasIntegral(String feriasIntegral) {
        markAsChanged("FERIASINTEGRAL", feriasIntegral);
        this.feriasIntegral = feriasIntegral;
   }

   public Timestamp getFimValeSocial() {
        return fimValeSocial;
   }

   public void setFimValeSocial(Timestamp fimValeSocial) {
        markAsChanged("FIMVALESOCIAL", fimValeSocial);
        this.fimValeSocial = fimValeSocial;
   }

   public String getGrupoEsocial() {
        return grupoEsocial;
   }

   public void setGrupoEsocial(String grupoEsocial) {
        markAsChanged("GRUPOESOCIAL", grupoEsocial);
        this.grupoEsocial = grupoEsocial;
   }

   public BigDecimal getHistCtbCrAtoCoop() {
        return histCtbCrAtoCoop;
   }

   public void setHistCtbCrAtoCoop(BigDecimal histCtbCrAtoCoop) {
        markAsChanged("HISTCTBCRATOCOOP", histCtbCrAtoCoop);
        this.histCtbCrAtoCoop = histCtbCrAtoCoop;
   }

   public BigDecimal getHistCtbDbAtoCoop() {
        return histCtbDbAtoCoop;
   }

   public void setHistCtbDbAtoCoop(BigDecimal histCtbDbAtoCoop) {
        markAsChanged("HISTCTBDBATOCOOP", histCtbDbAtoCoop);
        this.histCtbDbAtoCoop = histCtbDbAtoCoop;
   }

   public String getIdeEfr() {
        return ideEfr;
   }

   public void setIdeEfr(String ideEfr) {
        markAsChanged("IDEEFR", ideEfr);
        this.ideEfr = ideEfr;
   }

   public BigDecimal getIdeSubTeto() {
        return ideSubTeto;
   }

   public void setIdeSubTeto(BigDecimal ideSubTeto) {
        markAsChanged("IDESUBTETO", ideSubTeto);
        this.ideSubTeto = ideSubTeto;
   }

   public BigDecimal getIdMaior() {
        return idMaior;
   }

   public void setIdMaior(BigDecimal idMaior) {
        markAsChanged("IDMAIOR", idMaior);
        this.idMaior = idMaior;
   }

   public String getPermFracionarFer() {
        return permFracionarFer;
   }

   public void setPermFracionarFer(String permFracionarFer) {
        markAsChanged("PERMFRACIONARFER", permFracionarFer);
        this.permFracionarFer = permFracionarFer;
   }

   public String getPermAbonoPec() {
        return permAbonoPec;
   }

   public void setPermAbonoPec(String permAbonoPec) {
        markAsChanged("PERMABONOPEC", permAbonoPec);
        this.permAbonoPec = permAbonoPec;
   }

   public String getIntegraEmpPortalRh() {
        return integraEmpPortalRh;
   }

   public void setIntegraEmpPortalRh(String integraEmpPortalRh) {
        markAsChanged("INTEGRAEMPPORTALRH", integraEmpPortalRh);
        this.integraEmpPortalRh = integraEmpPortalRh;
   }

   public BigDecimal getCodEmpFin() {
        return codEmpFin;
   }

   public void setCodEmpFin(BigDecimal codEmpFin) {
        markAsChanged("CODEMPFIN", codEmpFin);
        this.codEmpFin = codEmpFin;
   }

   public String getAprovadp() {
        return aprovadp;
   }

   public void setAprovadp(String aprovadp) {
        markAsChanged("APROVADP", aprovadp);
        this.aprovadp = aprovadp;
   }

   public String getPortalAltCargaHoraria() {
        return portalAltCargaHoraria;
   }

   public void setPortalAltCargaHoraria(String portalAltCargaHoraria) {
        markAsChanged("PORTALALTCARGAHORARIA", portalAltCargaHoraria);
        this.portalAltCargaHoraria = portalAltCargaHoraria;
   }

   public String getFapNaoPublicada() {
        return fapNaoPublicada;
   }

   public void setFapNaoPublicada(String fapNaoPublicada) {
        markAsChanged("FAPNAOPUBLICADA", fapNaoPublicada);
        this.fapNaoPublicada = fapNaoPublicada;
   }

   public String getDebSusEsocial() {
        return debSusEsocial;
   }

   public void setDebSusEsocial(String debSusEsocial) {
        markAsChanged("DEBSUSESOCIAL", debSusEsocial);
        this.debSusEsocial = debSusEsocial;
   }

   public String getPermFeriasAntecip() {
        return permFeriasAntecip;
   }

   public void setPermFeriasAntecip(String permFeriasAntecip) {
        markAsChanged("PERMFERIASANTECIP", permFeriasAntecip);
        this.permFeriasAntecip = permFeriasAntecip;
   }

   public Timestamp getApuracaoCompetencia() {
        return apuracaoCompetencia;
   }

   public void setApuracaoCompetencia(Timestamp apuracaoCompetencia) {
        markAsChanged("APURACOMPETENCIA", apuracaoCompetencia);
        this.apuracaoCompetencia = apuracaoCompetencia;
   }

   public String getPermApuracaoCompet() {
        return permApuracaoCompet;
   }

   public void setPermApuracaoCompet(String permApuracaoCompet) {
        markAsChanged("PERMAPURACOMPET", permApuracaoCompet);
        this.permApuracaoCompet = permApuracaoCompet;
   }

   public Timestamp getDtVirada() {
        return dtVirada;
   }

   public void setDtVirada(Timestamp dtVirada) {
        markAsChanged("DTVIRADA", dtVirada);
        this.dtVirada = dtVirada;
   }

   public String getInAptApInexist() {
        return inAptApInexist;
   }

   public void setInAptApInexist(String inAptApInexist) {
        markAsChanged("INAPTAPINEXIST", inAptApInexist);
        this.inAptApInexist = inAptApInexist;
   }

   public String getIsMatriz() {
        return isMatriz;
   }

   public void setIsMatriz(String isMatriz) {
        markAsChanged("ISMATRIZ", isMatriz);
        this.isMatriz = isMatriz;
   }

   public String getPossuiS1000() {
        return possuiS1000;
   }

   public void setPossuiS1000(String possuiS1000) {
        markAsChanged("POSSUIS1000", possuiS1000);
        this.possuiS1000 = possuiS1000;
   }

   public String getTpAmbEsocial() {
        return tpAmbEsocial;
   }

   public void setTpAmbEsocial(String tpAmbEsocial) {
        markAsChanged("TPAMBESOCIAL", tpAmbEsocial);
        this.tpAmbEsocial = tpAmbEsocial;
   }

   public String getBloqAcessoRh() {
        return bloqAcessoRh;
   }

   public void setBloqAcessoRh(String bloqAcessoRh) {
        markAsChanged("BLOQACESSORH", bloqAcessoRh);
        this.bloqAcessoRh = bloqAcessoRh;
   }

   public String getBloqAcessoSnk() {
        return bloqAcessoSnk;
   }

   public void setBloqAcessoSnk(String bloqAcessoSnk) {
        markAsChanged("BLOQACESSOSNK", bloqAcessoSnk);
        this.bloqAcessoSnk = bloqAcessoSnk;
   }

   public String getBloqExibAniv() {
        return bloqExibAniv;
   }

   public void setBloqExibAniv(String bloqExibAniv) {
        markAsChanged("BLOQEXIBANIV", bloqExibAniv);
        this.bloqExibAniv = bloqExibAniv;
   }

   @Override
   public String getTableName() {
        return "TFPEMP";
   }

   @Override
   public String getEntityName() {
        return "EmpresaPessoal";
   }

   @Override
   public EmpresaPessoal fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.socioOstensivo = vo.asString("SOCIOOSTENSIVO");
        this.sugereDatPag = vo.asString("SUGEREDATPAG");
        this.tipDiaPag = vo.asString("TIPDIAPAG");
        this.tipEventoEsp = vo.asBigDecimal("TIPEVENTOESP");
        this.alterouEnd = vo.asString("ALTEROUEND");
        this.ativo = vo.asString("ATIVO");
        this.categFgts = vo.asBigDecimal("CATEGFGTS");
        this.centralizadora = vo.asString("CENTRALIZADORA");
        this.cgcAnt = vo.asString("CGCANT");
        this.cgcSindPatronal = vo.asString("CGCSINDPATRONAL");
        this.clubeInvest = vo.asString("CLUBEINVEST");
        this.codCenCus = vo.asBigDecimal("CODCENCUS");
        this.codCtabCoint = vo.asBigDecimal("CODCTABCOINT");
        this.codCtactbRever13 = vo.asBigDecimal("CODCTACTBREVER13");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEmpModHol = vo.asBigDecimal("CODEMPMODHOL");
        this.codEmpOrg = vo.asBigDecimal("CODEMPORG");
        this.codHistCtbRever13 = vo.asBigDecimal("CODHISTCTBREVER13");
        this.codPref = vo.asBigDecimal("CODPREF");
        this.codRegFis = vo.asBigDecimal("CODREGFIS");
        this.cpfRespCnpj = vo.asString("CPFRESPCNPJ");
        this.ctaCtbReverSao = vo.asBigDecimal("CTACTBREVERSAO");
        this.ctaFgts = vo.asBigDecimal("CTAFGTS");
        this.depositoJud = vo.asString("DEPOSITOJUD");
        this.diaPagFerias = vo.asBigDecimal("DIAPAGFERIAS");
        this.diaPagMensal = vo.asBigDecimal("DIAPAGMENSAL");
        this.diaPagQuinz = vo.asBigDecimal("DIAPAGQUINZ");
        this.diaPagQuinz2 = vo.asBigDecimal("DIAPAGQUINZ_2");
        this.diaPagSem = vo.asBigDecimal("DIAPAGSEM");
        this.dirfCpf = vo.asString("DIRFCPF");
        this.dirfDdd = vo.asString("DIRFDDD");
        this.dirfEmail = vo.asString("DIRFEMAIL");
        this.dirfFax = vo.asString("DIRFFAX");
        this.dirfFone = vo.asString("DIRFFONE");
        this.dirfNome = vo.asString("DIRFNOME");
        this.dirfRamal = vo.asString("DIRFRAMAL");
        this.dtAtual = vo.asTimestamp("DTATUAL");
        this.dtEvento = vo.asTimestamp("DTEVENTO");
        this.emAtividade = vo.asString("EMATIVIDADE");
        this.empDestinoCtb = vo.asBigDecimal("EMPDESTINOCTB");
        this.empDestinoGrelha = vo.asBigDecimal("EMPDESTINOGRELHA");
        this.geraMatricula = vo.asString("GERAMATRICULA");
        this.histCtbReverSao = vo.asBigDecimal("HISTCTBREVERSAO");
        this.mesDissidio = vo.asBigDecimal("MESDISSIDIO");
        this.modHollerit = vo.asBigDecimal("MODHOLLERIT");
        this.numConvInt = vo.asBigDecimal("NUMCONVINT");
        this.pagaExterior = vo.asString("PAGAEXTERIOR");
        this.percAlimConv = vo.asBigDecimal("PERCALIMCONV");
        this.percCestAlim = vo.asBigDecimal("PERCCESTALIM");
        this.vlrConfederativa = vo.asBigDecimal("VLRCONFEDERATIVA");
        this.vlrSindical = vo.asBigDecimal("VLRSINDICAL");
        this.percServico = vo.asBigDecimal("PERCSERVICO");
        this.percTranspo = vo.asBigDecimal("PERCTRANSPO");
        this.porte = vo.asBigDecimal("PORTE");
        this.progAlimTrab = vo.asString("PROGALIMTRAB");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.sindicalizada = vo.asString("SINDICALIZADA");
        this.situacaoEsp = vo.asString("SITUACAOESP");
        this.percCozinha = vo.asBigDecimal("PERCCOZINHA");
        this.percRefeicao = vo.asBigDecimal("PERCREFEICAO");
        this.vlrAssistencial = vo.asBigDecimal("VLRASSISTENCIAL");
        this.vlrAssociativa = vo.asBigDecimal("VLRASSOCIATIVA");
        this.inibePonto = vo.asString("INIBEPONTO");
        this.modPonto = vo.asBigDecimal("MODPONTO");
        this.arqModEmail = vo.asString("ARQMODEMAIL");
        this.impPortalRh = vo.asString("IMPPORTALRH");
        this.inibeHollerit = vo.asString("INIBEHOLLERIT");
        this.portalApto = vo.asString("PORTALAPONTO");
        this.portalEvolucao = vo.asString("PORTALEVOLUCAO");
        this.portalProgFerias = vo.asString("PORTALPROGFERIAS");
        this.importaPonto = vo.asString("IMPORTAPONTO");
        this.indDesfolha = vo.asBigDecimal("INDDESFOLHA");
        this.indEnted = vo.asString("INDENTED");
        this.indEtt = vo.asString("INDETT");
        this.indOptRegEletron = vo.asBigDecimal("INDOPTREGELETRON");
        this.indRpps = vo.asString("INDRPPS");
        this.indSimples = vo.asBigDecimal("INDSIMPLES");
        this.indSitPj = vo.asBigDecimal("INDSITPJ");
        this.iniValSocial = vo.asTimestamp("INIVALESOCIAL");
        this.logoFolha = vo.asString("LOGOFOLHA");
        this.nmEnte = vo.asString("NMENTE");
        this.nroCertif = vo.asString("NROCERTIF");
        this.nroProtRenov = vo.asString("NROPROTRENOV");
        this.nrRegEtt = vo.asString("NRREGETT");
        this.nrSiafi = vo.asBigDecimal("NRSIAFI");
        this.nuProcAltOutent = vo.asBigDecimal("NUPROCALTOUTENT");
        this.nuProcessoApr = vo.asBigDecimal("NUPROCESSOAPR");
        this.nuProcessoFap = vo.asBigDecimal("NUPROCESSOFAP");
        this.nuProcessoPcd = vo.asBigDecimal("NUPROCESSOPCD");
        this.nuProcessoRat = vo.asBigDecimal("NUPROCESSORAT");
        this.pagDou = vo.asBigDecimal("PAGDOU");
        this.pastaDoPonto = vo.asString("PASTADOPONTO");
        this.percEnte = vo.asBigDecimal("PERCENTE");
        this.percSeg = vo.asBigDecimal("PERCSEG");
        this.percSupl = vo.asBigDecimal("PERCSUPL");
        this.periodoImpPonto = vo.asBigDecimal("PERIODOIMPPONTO");
        this.reciboEsocial = vo.asString("RECIBOESOCIAL");
        this.regimeRetirRfcx = vo.asString("REGIMERETIRRFCX");
        this.siglaMin = vo.asString("SIGLAMIN");
        this.tipLotacao = vo.asBigDecimal("TIPLOTACAO");
        this.tipPonto = vo.asString("TIPPONTO");
        this.usadoEsocial = vo.asString("USADOESOCIAL");
        this.validaBaseImp = vo.asString("VALIDABASEIMP");
        this.valSubTeto = vo.asBigDecimal("VALSUBTETO");
        this.jesPon = vo.asString("JESPON");
        this.aliquotaFap = vo.asBigDecimal("ALIQUOTAFAP");
        this.aliquotaRat = vo.asBigDecimal("ALIQUOTARAT");
        this.cnpjEfr = vo.asString("CNPJEFR");
        this.cnpjProcurador = vo.asString("CNPJPROCURADOR");
        this.codBcoFin = vo.asBigDecimal("CODBCOFIN");
        this.codCenCusAtoCoop = vo.asBigDecimal("CODCENCUSATOCOOP");
        this.codCtabCofin = vo.asBigDecimal("CODCTABCOFIN");
        this.codEmpLotacao = vo.asBigDecimal("CODEMPLOTACAO");
        this.codGrelha = vo.asBigDecimal("CODGRELHA");
        this.codInfFisc = vo.asBigDecimal("CODINFFISC");
        this.codNatFpas = vo.asBigDecimal("CODNATFPAS");
        this.codNatSaldoRet = vo.asBigDecimal("CODNATSALDORET");
        this.codProjAtoCoop = vo.asBigDecimal("CODPROJATOCOOP");
        this.contaPr = vo.asString("CONTAPR");
        this.conteNted = vo.asString("CONTENTED");
        this.contPcd = vo.asString("CONTPCD");
        this.controlePonto = vo.asBigDecimal("CONTROLEPONTO");
        this.cpfProdrural = vo.asString("CPFPRODRURAL");
        this.ctaCtbCrAtoCoop = vo.asBigDecimal("CTACTBCRATOCOOP");
        this.ctaCtbDbAtoCoop = vo.asBigDecimal("CTACTBDBATOCOOP");
        this.dhUltimaImpPto = vo.asTimestamp("DHULTIMAIMPPTO");
        this.diaApuraPonto = vo.asBigDecimal("DIAAPURAPONTO");
        this.dtCargaInicial = vo.asTimestamp("DTCARGAINICIAL");
        this.dtDou = vo.asTimestamp("DTDOU");
        this.dtEmiCertif = vo.asTimestamp("DTEMICERTIF");
        this.dtIncEsocial = vo.asTimestamp("DTINC_ESOCIAL");
        this.dtInicioEsocial = vo.asTimestamp("DTINICIOESOCIAL");
        this.dtProtRenov = vo.asTimestamp("DTPROTRENOV");
        this.dtSesmt = vo.asTimestamp("DTSESMT");
        this.dtTerceiraFase = vo.asTimestamp("DTTERCEIRAFASE");
        this.dtUltEnvEsocial = vo.asTimestamp("DTULTENV_ESOCIAL");
        this.dtVencCertif = vo.asTimestamp("DTVENCCERTIF");
        this.envEsocial = vo.asString("ENVESOCIAL");
        this.enviaEmp = vo.asString("ENVIAEMP");
        this.feriasIntegral = vo.asString("FERIASINTEGRAL");
        this.fimValeSocial = vo.asTimestamp("FIMVALESOCIAL");
        this.grupoEsocial = vo.asString("GRUPOESOCIAL");
        this.histCtbCrAtoCoop = vo.asBigDecimal("HISTCTBCRATOCOOP");
        this.histCtbDbAtoCoop = vo.asBigDecimal("HISTCTBDBATOCOOP");
        this.ideEfr = vo.asString("IDEEFR");
        this.ideSubTeto = vo.asBigDecimal("IDESUBTETO");
        this.idMaior = vo.asBigDecimal("IDMAIOR");
        this.permFracionarFer = vo.asString("PERMFRACIONARFER");
        this.permAbonoPec = vo.asString("PERMABONOPEC");
        this.integraEmpPortalRh = vo.asString("INTEGRAEMPPORTALRH");
        this.codEmpFin = vo.asBigDecimal("CODEMPFIN");
        this.aprovadp = vo.asString("APROVADP");
        this.portalAltCargaHoraria = vo.asString("PORTALALTCARGAHORARIA");
        this.fapNaoPublicada = vo.asString("FAPNAOPUBLICADA");
        this.debSusEsocial = vo.asString("DEBSUSESOCIAL");
        this.permFeriasAntecip = vo.asString("PERMFERIASANTECIP");
        this.apuracaoCompetencia = vo.asTimestamp("APURACOMPETENCIA");
        this.permApuracaoCompet = vo.asString("PERMAPURACOMPET");
        this.dtVirada = vo.asTimestamp("DTVIRADA");
        this.inAptApInexist = vo.asString("INAPTAPINEXIST");
        this.isMatriz = vo.asString("ISMATRIZ");
        this.possuiS1000 = vo.asString("POSSUIS1000");
        this.tpAmbEsocial = vo.asString("TPAMBESOCIAL");
        this.bloqAcessoRh = vo.asString("BLOQACESSORH");
        this.bloqAcessoSnk = vo.asString("BLOQACESSOSNK");
        this.bloqExibAniv = vo.asString("BLOQEXIBANIV");
        return this;
   }
}
